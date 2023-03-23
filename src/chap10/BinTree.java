package chap10;

import java.util.Comparator;

public class BinTree<K, V> {
    // 노드
    static class Node<K, V> {
        private K key;              // 키 값
        private V data;             // 데이터
        private Node<K, V> left;    // 왼쪽 자식 노드
        private Node<K, V> right;   // 오른쪽 자식 노드

        // 생성자
        Node(K key, V data, Node<K, V> left, Node<K, V> right) {
            this.key   = key;
            this.data  = data;
            this.left  = left;
            this.right = right;
        }

        // 키 값을 반환
        K getKey() {
            return key;
        }

        // 데이터를 반환
        V getValue() {
            return data;
        }

        // 데이터를 출력
        void print() {
            System.out.println(data);
        }
    }

    private Node<K, V> root;    // 루트
    private Comparator<? super K> comparator = null;    // 비교자

    // 생성자
    public BinTree() {
        root = null;
    }

    // 생성자
    public BinTree(Comparator<? super K> c) {
        this();
        comparator = c;
    }
}
