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

        int row = N / 2;
        int col = N / 2;
        int number = 1;
        arr[col][row] = 1;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (i % 2 == 1) {
                    arr[--col][row] = ++number;
                } else {
                    arr[++col][row] = ++number;
                }
            }

            for (int j = 0; j < i; j++) {
                if (i % 2 == 1) {
                    arr[col][++row] = ++number;
                } else {
                    arr[col][--row] = ++number;
                }
            }
        }

        for (int i = N - 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                arr[--col][row] = ++number;
            }
        }

        int index_col = 0;
        int index_row = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == num) {
                    index_col = i+1;
                    index_row = j+1;
                }
                sb.append(arr[i][j]).append(" ");
            }
            sb.append('\n');
        }
        sb.append(index_col).append(" ").append(index_row);
        System.out.print(sb);
    }
}
