package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1003 {

    static Integer[][] dp = new Integer[41][2];     // null값 사용을 위해 Integer배열 사용

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[0][0] = 1;   // N=0 일 때의 0 호출 횟수
        dp[0][1] = 0;   // N=0 일 때의 1 호출 횟수
        dp[1][0] = 0;   // N=1 일 때의 0 호출 횟수
        dp[1][1] = 1;   // N=1 일 때의 1 호출 횟수

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스 수

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append('\n');
        }

        System.out.println(sb);
    }

    static Integer[] fibonacci(int N) {
        // N에 대한 0, 1의 호출 횟수가 없을 때 (탐색 전일 때)
        if (dp[N][0] == null || dp[N][1] == null) {
            // 각 N에 대한 0 호출 횟수와 1 호출 횟수를 재귀호출 한다.
            dp[N][0] = fibonacci(N-1)[0] + fibonacci(N-2)[0];
            dp[N][1] = fibonacci(N-1)[1] + fibonacci(N-2)[1];
        }

        // N에 대한 0과 1, 즉 [N][0]과 [N][1]을 담고 있는 [N]을 반환
        return dp[N];
    }
}
