package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number9461 {

    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 수

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());

            dp = new long[N+1];

            sb.append(equilTriangle(N)).append('\n');
        }

        System.out.println(sb);
    }

    static long equilTriangle(int N) {
        if (dp[N] != 0) {
            return dp[N];
        }

        switch (N) {
            case 1 :
                return dp[N] = 1;
            case 2 :
                return dp[N] = 1;
            case 3 :
                return dp[N] = 1;
            case 4 :
                return dp[N] = 2;
            case 5 :
                return dp[N] = 2;
        }

        return dp[N] = equilTriangle(N-1) + equilTriangle(N-5);
    }

}
