package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String str = br.readLine();
        str = str.toUpperCase();

        for (int i=0; i<str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {  // 소문자 범위
                arr[str.charAt(i) - 'A' ]++; // 해당하는 대문자 인덱스 증가
            }
        }

        int max = -1;
        char ch = '?';

        for (int i=0; i<26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char)(i+65);  // 대문자로 출력하기 위해 65를 더한다
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
