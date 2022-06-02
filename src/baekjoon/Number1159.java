package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] alpha = new int[26];              // 선수 성의 첫 문자의 개수를 담기 위한 배열

        for (int i=0; i<N; i++) {
            char c = br.readLine().charAt(0);   // 입력 받은 선수 성의 첫 문자
            alpha[c-97]++;                      // 소문자로만 주어지므로 아스키코드 a에 해당하는 97을 빼주면서 알파벳에 맞는 인덱스에 1씩 증가
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<alpha.length; i++) {
            if (alpha[i] >= 5) {                // 성이 같은 선수가 5명이 넘는다면
                sb.append((char)(i+97));        // 아스키코드 97을 더해주고 char로 형변환 해준다.
            }
        }

        if (sb.length() == 0) {
            sb.append("PREDAJA");
        }

        System.out.println(sb);
    }
}
