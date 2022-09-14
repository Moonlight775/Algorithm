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

        for (int i=1; i<n; i++) {
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);

            // 최댓값 갱신
            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}
