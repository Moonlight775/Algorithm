package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str = br.readLine().toCharArray();   // 평문
        char[] pw = new char[str.length];   // 암호화 키를 담을 배열
        String S = br.readLine();           // 암호화 키
        char[] alphabet = new char[27];     // 출력을 위한 알파벳 배열
        char code = 97;     // 알파벳 배열 초기화를 위한 아스키 코드

        // 알파벳 배열
        for (int i = 1; i < 27; i++) {
            alphabet[i] = code++;
        }

        // 암호화 키 배열 초기화
        for (int i = 0; i < pw.length; i++) {
            pw[i] = S.charAt(i % S.length());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {    // 공백일때는 공백 출력
                sb.append(" ");
            } else {
                // 평문의 문자를 암호화키의 문자가 알파벳 상에서 차지하는 순서만큼 앞으로 뺀 인덱스
                int index = (str[i] - 'a') - (pw[i] - 'a');

                // 인덱스가 0보다 작거나 같다는 것은 'z'로 돌아가 다시 역순으로 세는 것과 같다
                // 26 - (-index) 로 암호문을 구할 수 있다
                if (index <= 0) {
                    index = 26 + index;
                }

                sb.append(alphabet[index]);
            }
        }

        System.out.println(sb);
    }
}
