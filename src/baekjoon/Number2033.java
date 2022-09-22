package baekjoon;

import java.util.Scanner;

public class Number2033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 정수 N
        int count = 0;  // 정수가 몇 자리 수인지 알기 위한 변수

        while (N > 10) {
            // 끝자리가 5보다 크면 올림
            if (N%10 >= 5) {
                N = (N/10) +1;
            }
            // 아니라면 내림
            else {
                N = N / 10;
            }
            count++;    // 10으로 몇 번 나눠지는지
        }

        System.out.println(N * (int)Math.pow(10, count));
    }
}
