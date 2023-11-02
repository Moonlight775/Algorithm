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

}
