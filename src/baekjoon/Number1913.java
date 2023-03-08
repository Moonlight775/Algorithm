package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];
        int number = 1;

        int row = N / 2;
        int col = N / 2;

        int end = 1;

        while (true) {
            for (int i = 0; i < end; i++) {
                arr[col--][row] = number++;
            }

            if (number-1 == N*N) break;

            for (int i = 0; i < end; i++) {
                arr[col][row++] = number++;
            }
            end++;

            for (int i = 0; i < end; i++) {
                arr[col++][row] = number++;
            }
            for (int i = 0; i < end; i++) {
                arr[col][row--] = number++;
            }
            end++;
        }

        StringBuilder sb = new StringBuilder();
        int index_row = 0;
        int index_col = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]).append(" ");
                if (arr[i][j] == num) {
                    index_row = j+1;
                    index_col = i+1;
                }
            }
            sb.append('\n');
        }

        sb.append(index_col).append(" ").append(index_row);
        System.out.println(sb);
    }
}
