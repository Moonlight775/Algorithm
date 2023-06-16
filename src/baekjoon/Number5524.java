package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 문자열 개수

        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            String S = br.readLine();   // 문자열

            sb.append(S.toLowerCase()).append('\n');    // 소문자로 변경하여 출력
        }

        System.out.println(sb);
    }
}
