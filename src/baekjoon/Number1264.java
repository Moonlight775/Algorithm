package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1264 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int count = 0;

            String str = br.readLine(); // 영어 문장

            if (str.equals("#")) break; // #이 입력되면 종료

            str = str.toLowerCase();    // 대문자, 소문자 섞여 있으므로 소문자로 통일

            for (int i=0; i<str.length(); i++) {
                char c = str.charAt(i);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {     // 문자가 모음이라면
                    count++;
                }
            }

            System.out.println(count);
        }

    }
}
