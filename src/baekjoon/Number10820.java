package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;

        while ((str = br.readLine()) != null) {
            int low = 0;    // 소문자 개수
            int cap = 0;    // 대문자 개수
            int num = 0;    // 숫자 개수
            int space = 0;  // 공백 개수

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (Character.isLowerCase(c)) {
                    low++;
                }
                else if (Character.isUpperCase(c)) {
                    cap++;
                }
                else if (Character.isDigit(c)) {
                    num++;
                }
                else {
                    space++;
                }
            }

            sb.append(low).append(" ").append(cap).append(" ").append(num).append(" ").append(space).append('\n');
        }

        System.out.println(sb);
    }
}