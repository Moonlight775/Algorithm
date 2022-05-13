package baekjoon;

import java.util.Scanner;

public class Number2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            sb.append(" ".repeat(i));   // 공백 개수, i의 수만큼 공백 증가

            for (int j=N-i; j>0; j--) { // 별의 개수는 N-i로 정해짐
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
