package queue;

import Interface_form.Queue;

public class LinkedListQueue<E> implements Queue<E> {

    private Node<E> head;   // 큐에서 가장 앞에 있는 노드 객체를 가리키는 변수
    private Node<E> tail;   // 큐에서 가장 뒤에 있는 노드 객체를 가리키는 변수
    private int size;       // 큐에 담긴 요소의 개수

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
}
