package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] str = br.readLine().toCharArray();

        for (int i : str) {
            int c = i;  // 아스키코드 숫자로 변경

            if ('A' <= c && c <= 'Z') {
                c = c + 13;

                if (c > 90) {   // Z가 아스키코드로 90이므로 범위를 넘는다면 A부터 다시 시작하게 -26
                    c = c - 26;
                }
            }

            if ('a' <= c && c <= 'z') {
                c = c + 13;

                if (c > 122) {  // z가 아스키코드로 122이므로 범위를 넘는다면 a부터 다시 시작하게 -26
                    c = c - 26;
                }
            }

            sb.append((char) c);
        }

        System.out.println(sb);
    }
}