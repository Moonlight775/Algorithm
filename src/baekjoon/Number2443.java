package baekjoon;

import java.util.Scanner;

public class Number2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();               // 줄의 수

        for (int i=N; i>=1; i--) {          // i를 감소식으로 하여 별의 수가 줄어들고, 공백이 늘도록 한다.

            // 공백의 수는 N-i
            sb.append(" ".repeat(N - i));

            // 별의 수는 (2Xi)-1
            sb.append("*".repeat((2 * i) - 1));

            sb.append('\n');
        }
        System.out.println(sb);
    }
}
