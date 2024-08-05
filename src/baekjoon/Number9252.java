package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number9252 {

    private static long[][] dp;
    private static StringBuilder sb;
    private static char[] A;
    private static char[] B;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        A = br.readLine().toCharArray();
        B = br.readLine().toCharArray();
        dp = new long[A.length + 1][B.length + 1];
        sb = new StringBuilder();

        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= B.length; j++) {
                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;    // 같은 문자열일 때 왼쪽 대각선 값 + 1
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);    // 다르면 왼쪽과 위의 값 중 큰 수
                }
            }
        }

        System.out.println(dp[A.length][B.length]);

        getText(A.length, B.length);

        System.out.println(sb.reverse());   // 역으로 입력 했으므로 reverse()
    }

    // LCS 출력하기 함수
    private static void getText(int r, int c) {
        if (r == 0 || c == 0) return;

        if (A[r - 1] == B[c - 1]) {     // 같으면 LCS 에 기록하고 왼쪽 위로 이동
            sb.append(A[r - 1]);
            getText(r - 1, c - 1);
        }
        else {
            if (dp[r - 1][c] > dp[r][c - 1]) {  // 다르면 왼쪽과 위의 값 중 큰 수로 이동
                getText(r - 1, c);
            }
            else {
                getText(r, c - 1);
            }
        }
    }
}