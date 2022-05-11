package baekjoon;

import java.util.Scanner;

public class Number2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for (int i=N; i>0; i--) {
            sb.append("*".repeat(i)).append('\n');   // repeat()에 반복 횟수가 들어간다.
        }

        System.out.println(sb);
    }
}
