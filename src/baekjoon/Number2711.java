package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken()) - 1;   // 오타 위치 (인덱스가 0부터 시작이므로 -1)
            StringBuilder sb = new StringBuilder(st.nextToken());   // 창여이가 친 문자열

            sb.deleteCharAt(index);     // 오타 제거

            System.out.println(sb);
        }

    }
}

