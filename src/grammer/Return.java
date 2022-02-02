package grammer;

public class Return {
    public static void main(String[] args) {
        divide(4,2);
        divide(4,0);
    }

    public static void divide(int i, int j) {
        if (j == 0) {
            System.out.println("0으로 값을 나눌 수 없습니다.");
            return; // 리턴을 만나면 메소드 자체를 끝내겠다.
        }
        System.out.println("나눗셈 결과 : " + (i/j));
    }
}
