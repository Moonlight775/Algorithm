package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 표의 크기
        int M = Integer.parseInt(st.nextToken());   // 합을 구해야 하는 횟수

        int[][] arr = new int[N][N];    // 표

        // 표 초기화
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());

            // index가 0부터 시작하므로 좌표값에 -1씩 해줌
            int x1 = Integer.parseInt(st.nextToken()) -1;
            int y1 = Integer.parseInt(st.nextToken()) -1;
            int x2 = Integer.parseInt(st.nextToken()) -1;
            int y2 = Integer.parseInt(st.nextToken()) -1;
            int sum = 0;

            for (int i=x1; i<=x2; i++) {
                for (int j=y1; j<=y2; j++) {
                    sum += arr[i][j];
                }
            }

            sb.append(sum).append('\n');
        }

        System.out.println(sb);
    }
}
