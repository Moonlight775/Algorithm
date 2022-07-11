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

        System.out.println(BC(N,K));
    }

    static int BC(int n, int k) {
        if (dp[n][k] > 0) {     // 이미 풀었던 sub문제일 경우 값을 재활용
            return dp[n][k];
        }

        if (k == 0 || n == k) {     // nC0 = nCn = 1
            return dp[n][k] = 1;
        }

        return dp[n][k] = BC(n-1, k-1) + BC(n-1, k);    // nCr = n-1Cr-1 + n-1Cr (파스칼의 법칙)
    }
}
