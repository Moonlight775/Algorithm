package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 세로 크기
        int M = Integer.parseInt(st.nextToken());   // 가로 크기

        int[][] arr = new int[N][M];

        // 바닥 장식 모양 초기화
        for (int i=0; i<N; i++) {
            String str = br.readLine();
            for (int j=0; j<M; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int count = 0;

        // 행에 '-'의 개수 확인
        for (int i=0; i<N; i++) {
            int temp = 0;
            for (int j=0; j<M; j++) {
                if (arr[i][j] == '|') {
                    temp = 0;
                }
                else if (++temp == 1) {
                    count++;
                }
            }
        }

        // 열의 '|'의 개수 확인
        for (int j=0; j<M; j++) {
            int temp = 0;
            for (int i=0; i<N; i++) {
                if (arr[i][j] == '-') {
                    temp = 0;
                }
                else if (++temp == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
