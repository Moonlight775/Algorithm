package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2670 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 실수들의 개수
        double[] arr = new double[N + 1];   // 실수를 담을 배열
        double[] dp = new double[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        double max = 0;

        for (int i = 1; i <= N; i++) {
            dp[i] = Math.max(arr[i], arr[i] * dp[i - 1]);   // 점화식
            max = Math.max(max, dp[i]);     // 최대값
        }

        System.out.printf("%.3f", max);
    }
}