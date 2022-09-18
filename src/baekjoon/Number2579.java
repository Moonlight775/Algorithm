package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2579 {

    static Integer dp[];
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 계단의 개수

        dp = new Integer[N+1];
        arr = new int[N+1];

        // 계단 점수 배열 초기화
        for (int i=1; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0];     // 디폴트가 null이므로 0으로 초기화
        dp[1] = arr[1];

        if (N >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(maxScore(N));
    }

    static int maxScore(int N) {
        // 아직 탐색하지 않은 N번째 계단일 경우
        if (dp[N] == null) {
            dp[N] = Math.max(maxScore(N-2), maxScore(N-3) + arr[N-1]) + arr[N];
        }

        return dp[N];
    }
}
