package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1912 {

    static int[] arr;   // 수열 배열
    static Integer[] dp;    // 메모이제이션 할 dp (null값을 이용하기 위해 Integer 배열사용)
    static int max;     // 최댓값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n];
        dp = new Integer[n];

        // 수열 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // dp[0]은 첫 원소로 이전에 더 이상 탐색 할 것이 없는 상태이므로 arr[0] 자체 값이 된다.
        dp[0] = arr[0];
        max = arr[0];

        // dp의 마지막 index는 n-1이므로 n-1부터 Top-Down 탐색
        recur(n-1);

        System.out.println(max);
    }

    public static int recur(int n) {
        // 탐색하지 않은 index라면
        if (dp[n] == null) {
            dp[n] = Math.max(recur(n-1) + arr[n], arr[n]);

            // dp[n]과 max 중 큰 값으로 max 갱신
            max = Math.max(dp[n], max);
        }

        return dp[n];
    }

}
