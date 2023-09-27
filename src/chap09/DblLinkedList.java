package chap09;

import java.util.Comparator;

public class DblLinkedList<E> {
    // 노드
    class Node<E> {
        private E data;         // 데이터
        private Node<E> prev;   // 앞쪽 포인터 (앞쪽 노드에 대한 참조)
        private Node<E> next;   // 뒤쪽 포인터 (다음 노드에 대한 참조)

        // 생성자
        Node() {
            data = null;
            prev = next = this;
        }

        // 생성자
        Node(E obj, Node<E> prev, Node<E> next) {
            data = obj;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<E> head;   // 머리 노드 (더미 노드)
    private Node<E> crnt;   // 선택 노드

    // 생성자
    public DblLinkedList() {
        head = crnt = new Node<E>();    // 더미 노드를 생성
    }

    // 리스트가 비어 있는가?
    public boolean isEmpty() {
        return head.next == head;
    }

    // 노드를 검색
    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr = head.next;    // 현재 스캔 중인 노드

        while (ptr != head) {
            if (c.compare(obj, ptr.data) == 0) {
                crnt = ptr;
                return ptr.data;    // 검색 성공
            }
            ptr = ptr.next;         // 다음 노드로 선택
        }
        return null;                // 검색 실패
    }
}
