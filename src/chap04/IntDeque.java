package chap04;

public class IntDeque {
    private int max;    // 덱(deque)의 용량
    private int num;    // 현재 데이터 수
    private int front;  // 맨 앞 커서
    private int rear;   // 맨 뒤 커서
    private int[] que;  // 덱(deque)의 본체

    // 실행할 때 예외 : 큐가 비어 있음
    public class EmptyIntDequeException extends RuntimeException {
        public EmptyIntDequeException() { }
    }

    // 실행할 때 예외 : 큐가 가득 참
    public class OverflowIntDequeException extends RuntimeException {
        public OverflowIntDequeException() { }
    }

    // 생성자
    public IntDeque(int capacity) {
        num = front = rear = 0;
        max = capacity;

        try {
            que = new int[max];         // 덱(deque)본체용 배열을 생성
       } catch (OutOfMemoryError e) {   // 생성할 수 없음
            max = 0;
        }
    }

    // 덱에 데이터를 머리쪽부터 인큐
    public int enqueFront(int x) throws OverflowIntDequeException {
        if (num >= max) {
            throw new OverflowIntDequeException();  // 덱이 가득 참
        }

        num++;
        if (--front < 0) {
            front = max - 1;
        }

        que[front] = x;
        return x;
    }

    // 덱에 데이터를 꼬리쪽부터 인큐
    public int enqueRear(int x) throws OverflowIntDequeException {
        if (num >= max) {
            throw new OverflowIntDequeException();  // 덱이 가득 참
        }

        que[rear++] = x;
        num++;

        if (rear == max) {
            rear = 0;
        }

        return x;
    }

    // 덱에서 데이터를 머리쪽부터 디큐
    public int dequeFront() throws EmptyIntDequeException {
        if (num <= 0) {
            throw new EmptyIntDequeException();     // 덱이 비어 있음
        }

        int x = que[front++];
        num--;

        if (front == max) {
            front = 0;
        }

        return x;
    }

    // 덱에서 데이터를 꼬리쪽부터 디큐
    public int dequeRear() throws EmptyIntDequeException {
        if (num <= 0) {
            throw new EmptyIntDequeException();     // 덱이 비어 있음
        }

        num--;

        if (--rear < 0) {
            rear = max - 1;
        }

        return que[rear];
    }

    // 덱의 머리 데이터를 피크
    public int peekFront() throws EmptyIntDequeException {
        if (num <= 0) {
            throw new EmptyIntDequeException();     // 덱이 비어 있음
        }

        return que[front];
    }

    // 덱의 꼬리 데이터를 피크
    public int peekRear() throws EmptyIntDequeException {
        if (num <= 0) {
            throw new EmptyIntDequeException();     // 덱이 비어 있음
        }

        int result = rear - 1 < 0 ? max - 1 : rear - 1;

        return result;
    }

    // 덱에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max;

            if (que[idx] == x) {    // 검색 성공
                return idx;
            }
        }

        return -1;      // 검색 실패
    }

    // 덱에서 x를 검색하여 머리부터 몇 번째인가(찾지 못하면 0)를 반환
    public int search(int x) {
        for (int i = 0; i < num; i++) {
            if (que[(i + front) % max] == x) {  // 검색 성공
                return i + 1;
            }
        }

        return 0;       // 검색 실패
    }

    // 덱을 비움
    public void clear() {
        num = front = rear = 0;
    }

    // 덱의 용량을 반환
    public int capacity() {
        return max;
    }

    // 덱에 쌓여 있는 데이터 수를 반환
    public int size() {
        return num;
    }

    // 덱이 비어 있는가?
    public boolean isEmpty() {
        return num <= 0;
    }

    // 덱이 가득 찼는가?
    public boolean isFull() {
        return num >= max;
    }

    // 덱 내의 데이터를 머리 -> 꼬리 순으로 출력
    public void dump() {
        if (num <= 0) {
            System.out.println("덱이 비어 있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }
}
