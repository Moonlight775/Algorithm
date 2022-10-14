package list;

import Interface_form.List;

public class SLinkedList<E> implements List<E> {

    private Node<E> head;   // 노드의 첫 부분
    private Node<E> tail;   // 노드의 마지막 부분
    private int size;       // 요소 개수

    // 생성자
    public SLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // 특정 위치의 노드를 반환하는 메소드
    private Node<E> search(int index) {
        // 범위 밖(잘못된 위치)일 경우 예외 던지기
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> x = head;   // head가 가리키는 노드부터 시작

        for (int i=0; i<index; i++) {
            x = x.next;     // x노드의 다음 노드를 x에 저장한다
        }
        return x;
    }

    public void addFirst(E value) {

        Node<E> newNode = new Node<E>(value);   // 새 노드 생성
        newNode.next = head;    // 새 노드의 다음 노드로 head 노드를 연결
        head = newNode;     // head가 가리키는 노드를 새 노드로 변경
        size++;


        /* 다음에 가리킬 노드가 없는 경우 (=데이터가 새 노드밖에 없는 경우)
        * 데이터가 한 개 (새 노드)밖에 없으므로 새 노드는 처음 시작노드이자
        * 마지막 노드다. 즉 tail = head 다.
        */
        if (head.next == null) {
            tail = head;
        }
    }

    @Override
    public boolean add(E value) {
        addLast(value);
        return true;
    }

    public void addLast(E value) {
        Node<E> newNode = new Node<E>(value);   // 새 노드 생성

        if (size == 0) {    // 처음 넣는 노드일 경우 addFirst로 추가
            addFirst(value);
            return;
        }


        /* 마지막 노드(tail)의 다음 노드(next)가 새 노드를 가리키도록 하고
        * tail이 가리키는 노드를 새 노드로 바꿔준다.
        */
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    @Override
    public void add(int index, E value) {
        // 잘못된 인덱스를 참조할 경우 예외 발생
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        // 추가하려는 index가 가장 앞에 추가하려는 경우 addFirst 호출
        if (index == 0) {
            addFirst(value);
            return;
        }
        // 추가하려는 index가 마지막 위치일 경우 addLast 호출
        if (index == size) {
            addLast(value);
            return;
        }

        // 추가하려는 위치의 이전 노드
        Node<E> prev_Node = search(index-1);

        // 추가하려는 위치의 노드
        Node<E> next_Node = prev_Node.next;

        // 추가하려는 노드
        Node<E> newNode = new Node<E>(value);


        /* 이전 노드가 가리키는 노드를 끊은 뒤 새 노드로 변경해준다.
        * 또한 새 노드가 가리키는 노드는 next_Node로 설정해준다.
        */
        prev_Node.next = null;
        prev_Node.next = newNode;
        newNode.next = next_Node;
        size++;
    }

}



























