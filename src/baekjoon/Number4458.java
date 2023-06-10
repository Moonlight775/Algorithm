package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number4458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());    // 문장의 수

        while (N-- > 0) {
            String str = br.readLine();     // 주어지는 문장

            char first = str.charAt(0);     // 문장의 첫 번째 글자

            if (Character.isUpperCase(first)) {         // 첫 글자가 대문자라면
                sb.append(str).append('\n');            // 바로 출력
            } else {    // 첫 글자가 대문자가 아니라면
                String upper = String.valueOf(first);   // 첫 번째 글자를 문자열로 형변환

                StringBuilder result = new StringBuilder(str);
                result.replace(0, 1, upper.toUpperCase());  // 첫 번째 글자를 대문자로 변환
                sb.append(result).append('\n');
            }

        }

        System.out.println(sb);
    }
}
