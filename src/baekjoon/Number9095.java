package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number9095 {

    static int[] dp = new int[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 수

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];  // 점화식
       }

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());    // 정수

            System.out.println(dp[n]);
        }
    }
}