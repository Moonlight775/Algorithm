package simpleQuiz;

public class DiffSequence {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;

        for (int i=0; i<20; i++) {
            if(i != 19) {
                System.out.print(num + "+");
            } else {
                System.out.print(num);
            }

            sum += num; // 누적
            num = num + (i+1);  // 다음번 인덱스를 더한다.
        }
        System.out.println();
        System.out.println("Result : " + sum);
    }
}
