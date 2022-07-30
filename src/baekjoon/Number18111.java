package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   // 세로
        int M = Integer.parseInt(st.nextToken());   // 가로
        int B = Integer.parseInt(st.nextToken());   // 갖고 있는 블록 수

        int[][] map = new int[N][M];

        int min = Integer.MAX_VALUE;
        int max = 0;    // 음수가 없으므로

        // map 2차원 배열 초기화와 최솟값과 최댓값 초기화
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, map[i][j]);
                max = Math.max(max, map[i][j]);
            }
        }

        int sec = Integer.MAX_VALUE;
        int height = -1;

        for (int i=min; i<=max; i++) {
            int time = 0;
            int block = B;

            for (int j=0; j<N; j++) {
                for (int k=0; k<M; k++) {
                    int diff = map[j][k] - i;

                    if (diff > 0) {     // (j,k) 부분이 기준 i보다 높아서 제거
                        time += Math.abs(diff) * 2;
                        block += Math.abs(diff);
                    }
                    else if (diff < 0){ // (j,k) 부분이 기준 i보다 낮아서 추가
                        time += Math.abs(diff);
                        block -= Math.abs(diff);
                    }
                }
            }

            if (block < 0) {    // 블록이 부족하다면 땅 고르기가 안 됨, 스킵
                continue;
            }
            // 이 전 높이를 '땅 고르기' 할 때와 같거나 적게 걸렸다면 갱신 (i가 증가하므로 시간이 같더라도 가장 높은 땅의 높이 출력가능)
            if (sec >= time) {
                sec = time;
                height = i;
            }

        }

        System.out.println(sec + " " + height);
    }
}
