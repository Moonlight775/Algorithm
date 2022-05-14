package baekjoon;

import java.util.Scanner;

public class Number2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {          // N만큼 for문을 돌려준다.

            for (int j=N-i; j>0; j--) {     // 줄마다 공백의 수는 N-i와 같다.
                sb.append(" ");
            }

            for (int k=0; k<(2*i)-1; k++) { // 줄마다 별의 수는 (2Xi)-1와 같다.
                sb.append("*");
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}
