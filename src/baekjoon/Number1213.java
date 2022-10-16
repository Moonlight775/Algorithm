package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] a = new int[26];  // 문자열의 문자를 담을 배열

        // 배열 초기화
        for (int i=0; i<str.length(); i++) {
            a[str.charAt(i) -'A']++;
        }

        int odd = 0;    // 홀수개인 문자 개수
        int mid = 0;

        // 홀수개인 문자 찾기
        for (int i=0; i<26; i++) {
            if (a[i] % 2 != 0) {
                mid = i;    // 홀수인 문자
                odd++;      // 홀수 개수
            }
        }

        if (odd > 1 || (odd==1 && str.length()%2 == 0)) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<26; i++) {
            for (int j=0; j<a[i]/2; j++) {
                sb.append((char)(i+'A'));
            }
        }

        StringBuilder temp = new StringBuilder(sb.toString());
        // 홀수개인 문자가 1개라면 가운데 위치
        if (odd == 1) {
            sb.append((char)(mid+'A'));
        }
        System.out.println(sb.toString() + temp.reverse());

    }
}
