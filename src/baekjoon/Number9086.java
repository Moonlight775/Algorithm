package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            char first = str.charAt(0);     // 첫 글자
            char last = str.charAt(str.length() - 1);   // 마지막 글자

            sb.append(first).append(last).append('\n');
        }

        System.out.println(sb);
    }
}