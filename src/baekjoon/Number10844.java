package baekjoon;

import java.util.Scanner;

public class Number10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[][] dp = new long[N + 1][10];

        // N=1(길이가 1)일 때 1~9는 계단 수가 모두 1이므로 1로 초기화
        // 0으로 시작하면 안 되므로 dp[0][1]은 0으로 초기화
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        // H는 계단 높이로 높이에 따른 점화식은 아래와 같다.
        // H가 0이면 그 다음은 1만 올 수 있으므로 점화식은 dp[N][H] = dp[N-1][H+1]이다.
        // H가 9라면 그 다음은 8만 올 수 있으므로 점화식은 dp[N][H] = dp[N-1][H-1]이다.
        // H가 1~8이라면 점화식은 dp[N][H] = dp[N-1][H-1] + dp[N-1][H+1]이다.
        for (int i = 2; i <= N; i++) {
            dp[i][0] = dp[i - 1][1];
            dp[i][9] = dp[i - 1][8];
            for (int j = 1; j <= 8; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
            }
        }

        long sum = 0;   // 계단 수의 개수

        for (int i = 0; i <= 9; i++) {
            sum = (sum + dp[N][i]) % 1000000000;
        }

        System.out.println(sum);
    }
}