package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] ch;  // 비밀번호 char 배열
        char prev;  // 이전 글자
        boolean flag;   // true=높은 품질, false=낮은 품질
        int count;  // 연속으로 같은 글자 개수

        while (true) {
            String pwd = br.readLine();

            if (pwd.equals("end")) break;

            ch = pwd.toCharArray();
            prev = ' ';
            count = 0;
            flag = false;

            for (char c : ch) {
                if (isVowel(c)) flag = true;    // 1.

                if (isVowel(c) != isVowel(prev)) {  // 2.
                    count = 1;
                }
                else {
                    count++;
                }

                if (count > 2 || (c == prev && (c != 'e' && c != 'o'))) {   // 2. 3.
                    flag = false;
                    break;
                }

                prev = c;
            }

            if (flag) {
                sb.append("<").append(pwd).append("> is acceptable.").append('\n');
            }
            else {
                sb.append("<").append(pwd).append("> is not acceptable.").append('\n');
            }
        }

        System.out.println(sb);
    }

    // 모음인지 확인하는 메소드
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}