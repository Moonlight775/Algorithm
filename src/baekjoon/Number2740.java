package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];

        // 행렬 A 초기화
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] B = new int[M][K];

        // 행렬 B 초기화
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<K; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] C = new int[N][K];  // 곱셈 결과 행렬

        // 행렬 곱셈
        for (int i=0; i<N; i++) {
            for (int j=0; j<K; j++) {
                for (int k=0; k<M; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int[] i : C) {
            for (int j : i) {
                sb.append(j).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);

    }
}
