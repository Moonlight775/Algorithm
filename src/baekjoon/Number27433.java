package baekjoon;

import java.util.Scanner;

public class Number27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(recur(N));
    }

    // 재귀 방식 사용
    private static long recur(int N) {
        if (N <= 0) {
            return 1;
        }
        return N * recur(N - 1);
    }
}