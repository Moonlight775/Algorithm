package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1149 {

    static int[][] house;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 집의 개수

        house = new int[N][3];
        dp = new int[N][3];

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            house[i][0] = Integer.parseInt(st.nextToken());     // 빨강
            house[i][1] = Integer.parseInt(st.nextToken());     // 초록
            house[i][2] = Integer.parseInt(st.nextToken());     // 파랑
        }

        // dp의 첫 번째 값은 색상 비용의 첫 번째 값
        dp[0][0] = house[0][0];
        dp[0][1] = house[0][1];
        dp[0][2] = house[0][2];

        int result = Math.min(lowCost(N-1, 0), Math.min(lowCost(N-1, 1), lowCost(N-1, 2)));

        System.out.println(result);
    }

    public static int lowCost(int N, int color) {
        // 탐색하지 않았다면
        if (dp[N][color] == 0) {

            if (color == 0) {   // 빨강
                dp[N][0] = Math.min(lowCost(N-1, 1), lowCost(N-1, 2)) + house[N][0];
            }
            else if (color == 1) {  // 초록
                dp[N][1] = Math.min(lowCost(N-1,0), lowCost(N-1,2)) + house[N][1];
            }
            else {  // 파랑
                dp[N][2] = Math.min(lowCost(N-1, 0), lowCost(N-1, 1)) + house[N][2];
            }
        }

        return dp[N][color];
    }
}
