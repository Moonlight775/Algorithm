package chqp11;
// 체인법에 의한 해시

public class ChainHash<K,V> {
    // 해시를 구성하는 노드
    class Node<K, V> {
        private K key;      // 키 값
        private V data;     // 데이터
        private Node<K,V> next;     // 다음 노드에 대한 참조

        // 생성자
        Node(K key, V data, Node<K, V> next) {
            this.key = key;
            this.data = data;
            this.next = next;
        }

        // 키 값을 반환합니다.
        K getKey() {
            return key;
        }

        // 데이터를 반환합니다.
        V getValue() {
            return data;
        }

        // 키의 해시 값을 반환합니다.
        public int hashCode() {
            return key.hashCode();
        }
    }

    private int size;               // 해시 테이블의 크기
    private Node<K,V>[] table;      // 해시 테이블

    // 생성자
    public ChainHash(int capacity) {
        try {
            table = new Node[capacity];
            this.size = capacity;
        } catch (OutOfMemoryError e) {      // 테이블을 생성할 수 없음
            this.size = 0;
        }
    }

    // 해시 값을 구함
    public int hashValue(Object key) {
        return key.hashCode() % size;
    }
}
