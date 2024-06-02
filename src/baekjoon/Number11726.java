package baekjoon;

import java.util.Scanner;

public class Number11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] dp = new long[1001];
        dp[1] = 1;
        dp[2] = 2;

        // n=1 부터 방법의 수는
        // 1 2 3 5 8 13 21 ...
        // 점화식은 dp[n] = dp[n-1] + dp[n-2]
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        System.out.println(dp[n]);
    }
}