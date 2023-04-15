package baekjoon;

import java.util.Scanner;

public class Number2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        // 절반 위 별 그리기
        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N - i));
            sb.append("*".repeat(i));
            sb.append('\n');
        }

        // 아래 별 그리기
        for (int i = 1; i < N; i++) {
            sb.append(" ".repeat(i));
            sb.append("*".repeat(N - i));
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
