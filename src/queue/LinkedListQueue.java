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

    @Override
    public boolean offer(E value) {
        Node<E> newNode = new Node<E>(value);

        // 비어있을 경우
        if (size == 0) {
            head = newNode;
        }
        // 그 외의 경우 마지막 노드(tail)의 다음 노드(next)가 새 노드를 가리키도록 한다.
        else {
            tail.next = newNode;
        }

        // tail이 가리키는 노드를 새 노드로 바꿔준다.
        tail = newNode;
        size++;

        return true;
    }
}
