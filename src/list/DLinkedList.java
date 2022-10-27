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

    public void addFirst(E value) {
        Node<E> newNode = new Node<E>(value);   // 새 노드 생성
        newNode.next = head;    // 새 노드의 다음 노드로 head 노드를 연결

        /*
        * head가 null이 아닐 경우에만 기존 head노드의 prev 변수가 새 노드를 가리키도록 한다.
        * 이유는 기존 head 노드가 없는 경우(null)는 데이터가
        * 아무 것도 없던 상태였으므로 head.prev를 하면 잘못된 참조가 된다.
        * */
        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
        size++;

        /*
        * 다음에 가리킬 노드가 없는 경우 (=데이터가 새 노드밖에 없는 경우)
        * 데이터가 한 개(새 노드)밖에 없으므로 새 노드는 처음 시작노드이자 마지막 노드다.
        * 즉 tail = head 다.
        * */
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

        /*
        * 마지막 노드(tail)의 다음 노드(next)가 새 노드를 가리키도록 하고
        * tail이 가리키는 노드를 새 노드로 바꿔준다.
        * */
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public void add(int index, E value) {

        // 잘못된 인덱스를 참조할 경우 예외 발생
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        // 추가하려는 index가 가장 앞에 추가하려는 경우 addFrist 호출
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
        Node<E> prev_Node = search(index - 1);

        // 추가하려는 위치의 노드
        Node<E> next_Node = prev_Node.next;

        // 추가하려는 노드
        Node<E> newNode = new Node<E>(value);

        // 링크 끊기
        prev_Node.next = null;
        next_Node.prev = null;

        // 링크 연결하기
        prev_Node.next = newNode;

        newNode.prev = prev_Node;
        newNode.next = next_Node;

        newNode.prev = newNode;
        size++;
    }

}









































