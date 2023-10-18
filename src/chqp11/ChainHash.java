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
}
