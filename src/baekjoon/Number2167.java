package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   // 행 크기
        int M = Integer.parseInt(st.nextToken());   // 열 크기


        int[][] arr = new int[N][M];    // N행 M열 크기의 2차원 배열생성

        // 입력받은 수로 2차원 배열 초기화
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());    // 합을 구할 부분의 개수

        StringBuilder sb = new StringBuilder();
        while (K-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            // 2차원 배열 위치 (i,j), (x,y)
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int sum = 0;

            for (int a=i-1; a<=x-1; a++) {      // index는 0부터 시작이므로 각 위치에 -1을 해준다.
                for (int b=j-1; b<=y-1; b++) {
                    sum += arr[a][b];
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
