package baekjoon;

import java.util.Scanner;

public class Number9625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int[][] dp = new int[2][46];

        dp[1][1] = 1;

        // A의 수는 앞선 B의 수와 같다.
        // B의 수는 앞선 A와 B의 합과 같다.
        for (int i = 2; i <= k; i++) {
            dp[0][i] = dp[1][i - 1];
            dp[1][i] = dp[0][i - 1] + dp[1][i - 1];
        }

        System.out.println(dp[0][k] + " " + dp[1][k]);
    }
}