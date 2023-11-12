package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Number2547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            br.readLine();
            int N = Integer.parseInt(br.readLine());    // 학생의 수
            BigInteger sum = BigInteger.ZERO;   // 총 사탕 개수

            for (int j = 0; j < N; j++) {
                sum = sum.add(new BigInteger(br.readLine()));
            }

            // 나머지가 0이라면 공평하게 분배 가능
            if (sum.remainder(BigInteger.valueOf(N)).equals(BigInteger.ZERO)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}