package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2738 {

    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[N][M];   // 행렬 A
        int[][] arr2 = new int[N][M];   // 행렬 B

        // 행렬 A 초기화
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<M; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 행렬 B 초기화
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<M; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 행렬의 합
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                sb.append(arr1[i][j] + arr2[i][j]).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
