package baekjoon;

import java.util.Scanner;

public class Number10991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(Math.max(0, N - i)));

            for (int j = 1; j < i * 2; j++) {
                if (j % 2 != 0) {
                    sb.append("*");
                }
                else {
                    sb.append(" ");
                }
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}