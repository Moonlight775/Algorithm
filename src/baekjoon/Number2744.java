package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {    // 대문자인지 판별, 맞으면 true 아니라면 false
                sb.append(String.valueOf(ch).toLowerCase());
            } else {
                sb.append(String.valueOf(ch).toUpperCase());
            }
        }

        System.out.println(sb);
    }
}
