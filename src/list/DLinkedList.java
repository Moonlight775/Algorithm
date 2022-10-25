package list;

import Interface_form.List;

public class DLinkedList<E> implements List<E> {

    private Node<E> head;   // 노드의 첫 부분
    private Node<E> tail;   // 노드의 마지막 부분
    private int size;   // 요소 개수

    public DLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private Node<E> search(int index) {

        // 범위 밖(잘못된 위치)일 경우 예외 던지기
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        // 뒤에서부터 검색
        if (index > size / 2) {
            Node<E> x = tail;
            for (int i=size-1; i>index; i--) {
                x = x.prev;
            }
            return x;
        }

        // 앞에서부터 검색
        else {
            Node<E> x = head;
            for (int i=0; i<index; i++) {
                x = x.next;
            }
            return x;
        }
    }
}
