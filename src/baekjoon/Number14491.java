package baekjoon;

import java.util.Scanner;

public class Number14491 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();   // 10진수

        while (T > 0) {
            sb.append(T % 9);
            T = T / 9;
        }

        System.out.println(sb.reverse());
    }
}