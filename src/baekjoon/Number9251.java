package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();
        int length1 = str1.length;
        int length2 = str2.length;

        // 공집합 표현을 위해 인덱스 한 줄 추가
        int[][] dp = new int[length1 + 1][length2 + 1];

        // 1부터 시작 (index 0은 공집합이므로 0의 값을 갖는다)
        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                // (i-1)과 (j-1)번째 문자가 서로 같다면 (문자열은 인덱스 0부터 시작이므로 -1하여 시작)
                if (str1[i - 1] == str2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;    // 대각선 위의 dp에 +1한 값
                }
                // 문자가 같지 않다면
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);    // 이전 열과 이전 행 중 큰 값
                }
            }
        }

        System.out.println(dp[length1][length2]);
    }
}