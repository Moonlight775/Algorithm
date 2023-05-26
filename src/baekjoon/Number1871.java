package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 번호판의 수

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "-");

            char[] c = st.nextToken().toCharArray();        // 번호판 글자
            int num = Integer.parseInt(st.nextToken());     // 번호판 숫자

            int sum = 0;    // 글자를 26진법으로 변환한 수

            for (int i = 0; i < 3; i++) {
                // 문자에 해당하는 수 x 문자위치에 따른 26 제곱
                sum += (c[i] - 'A') * (int)Math.pow(26, 2 - i);
            }

            // 글자를 26진법 수로 변환한 수와 숫자의 차가 100 이하라면 nice 출력
            if (Math.abs(sum - num) <= 100) {
                System.out.println("nice");
            } else {
                System.out.println("not nice");
            }
        }
    }
}
