package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());   // 시작 숫자
            int M = Integer.parseInt(st.nextToken());   // 끝 숫자
            int count = 0;  // 0의 개수

            for (int i = N; i <= M; i++) {
                String num = String.valueOf(i);     // 확인할 수

                for (int j = 0; j < num.length(); j++) {
                    if (num.charAt(j) == '0') {     // 수에 0이 있다면 카운트 +1
                        count++;
                    }
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
