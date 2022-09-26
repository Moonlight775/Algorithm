package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1932 {

    static int[][] triangle;
    static Integer[][] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());    // 삼각형의 크기

        triangle = new int[n][n];
        dp = new Integer[n][n];

        // 정수 삼각형 초기화
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<i+1; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 맨 밑의 값은 dp배열에도 똑같이 저장 (이걸 기준으로 max메소드에서 양쪽값을 비교)
        for (int i=0; i<n; i++) {
            dp[n-1][i] = triangle[n-1][i];
        }

        System.out.println(max(0,0));
    }

    public static int max(int depth, int index) {
        // 마지막 행일 경우 핸재 위치 dp값 반환
        if (depth == n-1) {
            return dp[depth][index];
        }

        // 탐색 전의 경우 다음 행의 양쪽 값 비교
        if (dp[depth][index] == null) {
            dp[depth][index] = Math.max(max(depth+1, index), max(depth+1, index+1)) + triangle[depth][index];
        }

        return dp[depth][index];
    }

}
