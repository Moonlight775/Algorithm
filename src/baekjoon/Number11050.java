package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number11050 {

    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());    // 자연수 N
        int K = Integer.parseInt(st.nextToken());    // 정수 K

        dp = new int[N+1][K+1];

        for (int i=0; i<=K; i++) {      // N == K
            dp[i][i] = 1;
        }

        for (int i=0; i<=N; i++) {      // K == 0
            dp[i][0] = 1;
        }

        for (int i=2; i<=N; i++) {
            for (int j=1; j<=K; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        System.out.println(dp[N][K]);
    }
}
