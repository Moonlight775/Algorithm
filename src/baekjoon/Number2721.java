package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());    // 정수
            int sum = 1;
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                sum += i + 1;   // T(K+1) 식을 구하기 위해 누적 합 해준다.
                answer += i * sum;
            }

            System.out.println(answer);
        }
    }
}