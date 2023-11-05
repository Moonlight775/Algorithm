package chqp11;
// 오픈 주소법에 의한 해시

public class OpenHash<K,V> {
    // 버킷의 상태
    enum Status {OCCUPIED, EMPTY, DELETED};     // {데이터 저장, 비어 있음, 삭제 마침}

    // 버킷
    static class Bucket<K, V> {
        private K key;          // 키 값
        private V data;         // 데이터
        private Status stat;    // 상태

        // 생성자
        Bucket() {
            stat = Status.EMPTY;    // 버킷은 비어 있음
        }

        // 모든 필드에 값을 설정
        void set(K key, V data, Status stat) {
            this.key = key;     // 키 값
            this.data = data;   // 데이터
            this.stat = stat;   // 상태
        }

        // 상태를 설정
        void setStat(Status stat) {
            this.stat = stat;
        }

        // 키 값을 반환
        K getKey() {
            return key;
        }

        // 데이터를 반환
        V getValue() {
            return data;
        }

        // 키의 해시 값을 반환
        public int hashCode() {
            return key.hashCode();
        }
    }

    private int size;               // 해시 테이블의 크기
    private Bucket<K,V>[] table;    // 해시 테이블

    // 생성자
    public OpenHash(int size) {
        try {
            table = new Bucket[size];
            for (int i = 0; i < size; i++) {
                table[i] = new Bucket<K, V>();
            }
            this.size = size;
        } catch (OutOfMemoryError e) {      // 테이블을 생성할 수 없음
            this.size = 0;
        }
    }

    // 해시 값을 구함
    public int hashValue(Object key) {
        return key.hashCode() % size;
    }

    // 재해시 값을 구함
    public int rehashValue(int hash) {
        return (hash + 1) % size;
    }

    // 키 값 key를 갖는 버킷의 검색
    private Bucket<K, V> searchNode(K key) {
        int hash = hashValue(key);      // 검색할 데이터의 해시 값
        Bucket<K,V> p = table[hash];    // 선택 버킷

        for (int i = 0; p.stat != Status.EMPTY && i < size; i++) {
            if (p.stat == Status.OCCUPIED && p.getKey().equals(key)) {
                return p;
            }
            hash = rehashValue(hash);   // 재해시
            p = table[hash];
        }
        return null;
    }

    // 키 값 key를 갖는 요소의 검색 (데이터를 반환)
    public V search(K key) {
        Bucket<K, V> p = searchNode(key);

        if (p != null) {
            return p.getValue();
        } else {
            return null;
        }
    }

}
