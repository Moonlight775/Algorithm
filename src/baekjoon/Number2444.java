package baekjoon;

import java.util.Scanner;

public class Number2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for (int i=1; i<N; i++) {
            sb.append(" ".repeat(N-i));
            sb.append("*".repeat((2*i)-1)).append('\n');
        }

        for (int i=N; i>0; i--) {
            sb.append(" ".repeat(N-i));
            sb.append("*".repeat((2*i)-1)).append('\n');
        }

        System.out.println(sb);
    }
}
