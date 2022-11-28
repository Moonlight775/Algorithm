package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[][] room = new char[N][N];

        // 2차원 배열 초기화
        for (int i=0; i<N; i++) {
            String str = br.readLine();
            for (int j=0; j<N; j++) {
                room[i][j] = str.charAt(j);
            }
        }

        int row = 0;    // 가로로 누울 수 있는 자리 수
        int col = 0;    // 세로로 누울 수 있는 자리 수

        for (int i=0; i<N; i++) {
            int check_h = 0;
            int check_v = 0;

            for (int j=0; j<N-1; j++) {
                // 가로 확인
                if (room[i][j] == '.') {
                    check_h++;
                }
                if (room[i][j] == 'X' || j == N-1) {
                    if (check_h > 1) row++;

                    check_h = 0;
                }

                // 세로 확인
                if (room[j][i] == '.') {
                    check_v++;
                }
                if (room[j][i] == 'X' || j == N-1) {
                    if (check_v > 1) col++;

                    check_v = 0;
                }

            }
        }

        System.out.print(row + " " + col);

    }
}
