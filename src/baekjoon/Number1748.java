package baekjoon;

import java.util.Scanner;

public class Number1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i=1; i<=N; i++) {
            sb.append(i);
        }

        System.out.println(sb.length());
    }
}
