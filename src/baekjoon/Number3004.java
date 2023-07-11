package baekjoon;

import java.util.Scanner;

public class Number3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 자르는 횟수
        int result = 2;         // 최대 조각 수
        int plus = 2;           // 늘어나는 조각 수

        for (int i = 1; i < N; i++) {
            result += plus;

            // 최대 조각 수의 증가는 2, 2, 3, 3, 4, 4, ...
            if (i % 2 == 0) {
                plus++;
            }
        }

        System.out.println(result);
    }
}
