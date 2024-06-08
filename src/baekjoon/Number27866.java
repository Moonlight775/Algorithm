package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();   // 단어
        int i = Integer.parseInt(br.readLine());    // 정수

        System.out.println(S.charAt(i - 1));    // index 가 0부터 시작하므로 -1
    }
}