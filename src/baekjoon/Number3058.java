package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 데이터의 수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int sum = 0;        // 짝수의 합
            int min = 101;      // 최솟값

            for (int i = 0; i < 7; i++) {
                int num = Integer.parseInt(st.nextToken());

                if (num % 2 == 0) {     // 주어진 수가 짝수라면
                    sum += num;         // 짝수 누적합
                    min = Math.min(min, num);   // 짝수 최솟값
                }
            }

            sb.append(sum).append(" ").append(min).append('\n');
        }

        System.out.println(sb);
    }
}
