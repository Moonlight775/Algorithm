package chap09;

import java.util.Comparator;

public class LinkedList<E> {
    // 노드
    class Node<E> {
        private E data;         // 데이터
        private Node<E> next;   // 뒤족 포인터(다음 노드 참조)

        // 생성자
        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head;   // 머리 노드
    private Node<E> crnt;   // 선택 노드

    // 생성자
    public LinkedList() {
        head = crnt = null;
    }

    // 노드 검색
    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr = head;     // 현재 스캔 중인 노드

        while (ptr != null) {
            if (c.compare(obj, ptr.data) == 0) {    // 검색 성공
                crnt = ptr;
                return ptr.data;
            }
            ptr = ptr.next;     // 다음 노드를 선택
        }
        return null;    // 검색 실패
    }

    // 머리에 노드 삽입
    public void addFirst(E obj) {
        Node<E> ptr = head;     // 삽입 전의 머리 노드
        head = crnt = new Node<E>(obj, ptr);
    }

    // 꼬리에 노드 삽입
    public void addLast(E obj) {
        if (head == null) {     // 리스트가 비어 있으면
            addFirst(obj);      // 머리에 삽입
        } else {
            Node<E> ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = crnt = new Node<E>(obj, null);
        }
    }
}
