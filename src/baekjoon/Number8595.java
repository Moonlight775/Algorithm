package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number8595 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 단어의 길이
        char[] word = br.readLine().toCharArray();
        int sum = 0;            // 히든 넘버의 합
        StringBuilder intStr = new StringBuilder();     // 히든 넘버

        for (int i = 0; i < n; i++) {
            // ASCII에서 숫자 0은 48, 숫자 9는 57
            // 숫자라면 히든넘버
            if (48 <= word[i] && word[i] <= 57) {
                intStr.append(word[i]);
            }
            else {
                // 히든넘버가 존재하면 sum에 누적합
                if (!intStr.toString().equals("")) {
                    sum += Integer.parseInt(intStr.toString());
                }
                // 두 히든 넘버 사이에는 글자가 존재하므로 숫자가 아닐때는 히든넘버를 초기화
                intStr = new StringBuilder();
            }
        }

        System.out.println(sum);
    }
}
