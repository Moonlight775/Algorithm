package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number6359 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());    // 방의 개수
            int count = 0;  // 열린 방의 수
            boolean[] room = new boolean[n + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j += i) {
                    room[j] = !room[j]; // 방이 열려있다면 닫고, 닫혀있다면 연다
                }
            }

            // 열린 방의 수 찾기
            for (int i = 1; i <= n; i++) {
                if (room[i]) {
                    count++;
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}