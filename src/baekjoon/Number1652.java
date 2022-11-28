package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[][] room = new char[N+1][N+1];

        // 2차원 배열 초기화
        for (int i=0; i<N; i++) {
            String str = br.readLine();
            for (int j=0; j<N; j++) {
                room[i][j] = str.charAt(j);
            }
            // N번째 줄(벽)을 짐으로 표현
            room[i][N] = 'X';
            room[N][i] = 'X';
        }


        int row = 0;    // 가로로 누울 수 있는 자리 수
        int col = 0;    // 세로로 누울 수 있는 자리 수

        for (int i=0; i<N; i++) {
            for (int j=0; j<N-1; j++) {
                // 가로 확인
                if (room[i][j] == '.' && room[i][j+1] == '.' && room[i][j+2] == 'X') {
                    row++;
                }

                // 세로 확인
                if (room[j][i] =='.' && room[j+1][i] =='.' && room[j+2][i] == 'X') {
                    col++;
                }
            }
        }

        System.out.print(row + " " + col);

    }
}
