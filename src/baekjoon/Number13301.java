package baekjoon;

import java.util.Scanner;

public class Number13301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] dp = new long[N];
        dp[0] = 4;

        if (N > 1) {
            dp[1] = 6;
        }

        // 직사각형의 둘레는 4, 6, 10, 16, 26, ...
        // 점화식 dp[N] = dp[N-1] + dp[N-2]
        for (int i = 2; i < N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[N-1]);
    }
}