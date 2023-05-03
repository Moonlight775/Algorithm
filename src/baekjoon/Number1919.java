package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();           // 첫 번째 영어단어
        String second = br.readLine();          // 두 번째 영어단어

        int[] first_alpha = new int[26];        // 첫 번째 영어단어 알파벳 배열
        int[] second_alpha = new int[26];       // 두 번째 영어단어 알파벳 배열

        // 첫 번째 단어 배열 초기화
        for (int i = 0; i < first.length(); i++) {
            int index = first.charAt(i) - 'a';
            first_alpha[index]++;
        }

        // 두 번째 단어 배열 초기화
        for (int i = 0; i < second.length(); i++) {
            int index = second.charAt(i) - 'a';
            second_alpha[index]++;
        }

        int count = 0;  // 제거해야 하는 문자 개수

        // 문자가 다른 개수 확인
        for (int i = 0; i < 26; i++) {
            count += Math.abs(first_alpha[i] - second_alpha[i]);
        }

        System.out.println(count);
    }
}
