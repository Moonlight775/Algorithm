package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   // 세로 크기
        int M = Integer.parseInt(st.nextToken());   // 가로 크기

        int row_count = 0;  // 행에 필요한 경비원 수
        int col_count = 0;  // 열에 필요한 경비원 수

        char[][] castle = new char[N][M];

        // 성 2차원 배열 초기화
        for (int i=0; i<N; i++) {
            String str = br.readLine();

            for (int j=0; j<M; j++) {
                castle[i][j] = str.charAt(j);
            }
        }

        // 행에 경비원이 있는지 확인
        for (int i=0; i<N; i++) {
            boolean check = true;

            for (int j=0; j<M; j++) {
                if (castle[i][j] == 'X') {
                    check = false;
                    break;
                }
            }
            // 행에 X가 하나라도 없다면 check는 true로 count 증가
            if (check) {
                row_count++;
            }
        }

        // 열에 경비원이 있는지 확인
        for (int i=0; i<M; i++) {
            boolean check = true;

            for (int j=0; j<N; j++) {
                if (castle[j][i] == 'X') {
                    check = false;
                    break;
                }
            }
            // 열에 X가 하나라도 없다면 check는 true로 count 증가
            if (check) {
                col_count++;
            }
        }

        System.out.println(Math.max(row_count, col_count)); // 행과 열 중 많이 필요한 경비원 수를 출력
    }
}
