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

    // 선택 노드를 출력
    public void printCurrentNode() {
        if (isEmpty()) {
            System.out.println("선택 노드가 없습니다.");
        } else {
            System.out.println(crnt.data);
        }
    }

    // 모든 노드를 출력
    public void dump() {
        Node<E> ptr = head.next;    // 더미 노드의 다음 노드

        while (ptr != head) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    // 모든 노드를 거꾸로 출력
    public void dumpReverse() {
        Node<E> ptr = head.prev;    // 더미 노드의 앞쪽 노드

        while (ptr != head) {
            System.out.println(ptr.data);
            ptr = ptr.prev;
        }
    }

    // 선택 노드를 하나 뒤쪽으로 이동
    public boolean next() {
        if (isEmpty() || crnt.next == head) {
            return false;       // 이동할 수 없음
        }
        crnt = crnt.next;
        return true;
    }

    // 선택 노드를 하나 앞쪽으로 이동
    public boolean prev() {
        if (isEmpty() || crnt.prev == head) {
            return false;       // 이동할 수 없음
        }
        crnt = crnt.prev;
        return true;
    }
}
