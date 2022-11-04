package list;

import Interface_form.Queue;

public class ArrayQueue<E> implements Queue<E> {

    private static final int DEFAULT_CAPACITY = 64; // 최소(기본) 용적 크기

    private Object[] array; // 요소를 담을 배열
    private int size;   // 요소 개수

    private int front;  // 시작 인덱스를 가리키는 변수(빈 공간임을 유의)
    private int rear;   // 마지막 요소의 인덱스를 가리키는 변수

    // 생성자1 (초기 용적 할당을 안 할 경우)
    public ArrayQueue() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }

    // 생성자2 (초기 용적 할당을 할 경우)
    public ArrayQueue(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }
}
