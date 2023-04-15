package baekjoon;

import java.util.Scanner;

public class Number2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        // 절반 위 별 그리기
        for (int i = 1; i <= N; i++) {

            for (int j = 0; j < N - i; j++) {
                sb.append(" ");
            }

            for (int k = 0; k < i; k++) {
                sb.append("*");
            }

            sb.append('\n');
        }

        // 아래 별 그리기
        for (int i = 1; i < N; i++) {

            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }

            for (int k = 0; k < N - i; k++) {
                sb.append("*");
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}
