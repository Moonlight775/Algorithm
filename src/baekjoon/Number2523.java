package baekjoon;

import java.util.Scanner;

public class Number2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        // 중간 위 별 그리기
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append('\n');
        }

        // 아래 별 그리기
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                sb.append("*");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
