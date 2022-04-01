package backjoon;

import java.util.Scanner;

public class Number2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        for (int i=0; i<5; i++) {
            int tmp = sc.nextInt(); // 입력받은 수
            result += Math.pow(tmp, 2); // 입력받은 수를 Math.pow()를 사용하여 제곱해준 후 result에 더해준다.
        }
        System.out.println(result%10);
    }
}
