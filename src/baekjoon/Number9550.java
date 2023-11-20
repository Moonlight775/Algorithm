package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number9550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());   // 소지한 사탕의 종류의 수
            int K = Integer.parseInt(st.nextToken());   // 한 종류의 사탕을 먹었을 때 행복해지는 최소한의 개수
            int num = 0;    // 생일파티에 올 수 있는 최대 아이들의 수

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int candy = Integer.parseInt(st.nextToken());   // 사탕의 수

                num += candy / K;   // 생일파티에 올 수 있는 아이의 수
            }

            System.out.println(num);
        }
    }
}