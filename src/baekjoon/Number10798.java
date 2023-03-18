package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] str = new char[5][15];
        int max = 0;    // 가장 긴 문자열

        // 문자열 초기화 및 max값 찾기
        for (int i = 0; i < 5; i++) {
            String S = br.readLine();
            max = Math.max(max, S.length());
            for (int j = 0; j < S.length(); j++) {
                str[i][j] = S.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (str[j][i] == '\0') continue;    // char 초기값이면 스킵
                sb.append(str[j][i]);
            }
        }

        System.out.println(sb);
    }
}