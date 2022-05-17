package baekjoon;

import java.util.Scanner;

public class Number2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {                      // i=1 -> i=5까지 증가
            sb.append("*".repeat(i));                   // N번째 줄까지 별의 개수가 1개씩 증가
            sb.append(" ".repeat((N-i)*2));             // N번째 줄까지 공백의 개수는 (N-i)*2 개씩 감소
            sb.append("*".repeat(i)).append('\n');      // 공백 후 다시 별 출력
        }

        for (int i=N-1; i>0; i--) {                     // i=4 -> i=1까지 감소
            sb.append("*".repeat(i));                   // 별의 개수가 1개씩 감소
            sb.append(" ".repeat((N-i)*2));             // 공백의 개수는 X2씩 증가
            sb.append("*".repeat(i)).append('\n');      // 공백 후 다시 별 출력
        }

        System.out.println(sb);
    }
}
