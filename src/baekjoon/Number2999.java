package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int N = str.length();
        int R = 0;  // 행 길이
        int C = 0;  // 열 길이

        // 행과 열 길이 구하기
        for (int i = 1; i <= N / i; i++) {
            if (N % i == 0) {
                R = i;
                C = N / i;
            }
        }

        char[][] arr = new char[R][C];
        int index = 0;

        // 행렬 초기화
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                arr[j][i] = str.charAt(index);
                index++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sb.append(arr[i][j]);
            }
        }

        System.out.println(sb);
    }
}
