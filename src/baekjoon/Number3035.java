package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number3035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int ZR = Integer.parseInt(st.nextToken());
        int ZC = Integer.parseInt(st.nextToken());
        char[][] arr = new char[R][C];

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < ZR; j++) {
                for (int k = 0; k < C; k++) {
                    for (int l = 0; l < ZC; l++) {
                        sb.append(arr[i][k]);
                    }
                }
                sb.append('\n');
            }
        }

        System.out.println(sb);
    }
}