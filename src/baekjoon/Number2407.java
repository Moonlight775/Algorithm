package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Number2407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BigInteger[][] combination = new BigInteger[n+1][n+1];  // 이중 for문에서 j의 범위가 j<=i라서 n의 크기에 맞게 배열 생성

        for (int i=1; i<=n; i++) {
            for (int j=0; j<=i; j++) {  // BigInteger의 초기값은 null이므로 조건범위를 j<=m으로 할 경우 NullPointerException이 떨어짐

                if (i == j || j == 0) {     // nCn = 1, nC0 = 1
                    combination[i][j] = new BigInteger("1");
                }
                else {
                    combination[i][j] = combination[i-1][j-1].add(combination[i-1][j]);    // nCr = n-1Cr-1 + n-1Cr
                }
            }
        }
        System.out.println(combination[n][m]);
    }
}
