package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 학생의 수
        int C = Integer.parseInt(st.nextToken());   // 폭죽쇼가 끝나는 시간
        int[] student = new int[N];     // 학생들이 폭죽을 터뜨리는 주기 배열

        // 배열 초기화
        for (int i = 0; i < N; i++) {
            student[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;  // 폭죽 터지는 횟수

        for (int i = 1; i <= C; i++) {
            for (int j = 0; j < N; j++) {
                // 나머지가 0일 때가 폭죽을 볼 수 있을 때
                // 중복되지 않게 카운트 후 다음 초로 갈 수 있도록 break 설정
                if (i % student[j] == 0) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
