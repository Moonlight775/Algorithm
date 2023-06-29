package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5354 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());    // 박스 크기

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // 박스 바깥 부분은 '#' 출력
                    if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                        sb.append("#");
                    } else {
                        sb.append("J");
                    }
                }
                sb.append('\n');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
