package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[26];  // 알파벳 개수

        String str = br.readLine(); // 입력받은 단어

        for (int i=0; i<str.length(); i++) {
            count[str.charAt(i)-'a'] += 1;  // 알파벳에 해당하는 index에 값을 1씩 증가
        }

        for (int i : count) {
            System.out.print(i + " ");
        }
    }
}
