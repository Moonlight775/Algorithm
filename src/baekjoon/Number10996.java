package baekjoon;

import java.util.Scanner;

public class Number10996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        if (N >= 2) {
            for (int i = 1; i <= N * 2; i++) {
                if (i % 2 != 0) {
                    int length = (int) Math.ceil((double) N / 2);
                    sb.append("* ".repeat(length)).append('\n');
                }
                else {
                    int length = (int) Math.floor((double) N / 2);
                    sb.append(" *".repeat(length)).append('\n');
                }
            }

        }
        else {
            sb.append("*");
        }

        System.out.println(sb);
    }
}