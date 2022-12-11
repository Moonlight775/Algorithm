package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2669 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] map = new int[101][101];    // x, y좌표가 100이하인 정수로 이루어지므로 크기가 101인 2차원배열 생성

        for (int i=0; i<4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 2차원배열 초기화
            for (int j=x1; j<x2; j++) {
                for (int k=y1; k<y2; k++) {
                    map[j][k] = 1;
                }
            }

        }

        int count = 0;  // 면적을 담을 변수

        for (int[] val : map) {
            for (int value : val) {
                // 1로 초기화되어있는 곳이 면적에 해당
                if (value == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
