package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number4447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());    // 테스트 케이스의 수

        while (n-- > 0) {
            String str = br.readLine();     // 이름

            int g = 0;
            int b = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'g' || str.charAt(i) == 'G') {
                    g++;
                } else if (str.charAt(i) == 'b' || str.charAt(i) == 'B') {
                    b++;
                }
            }

            if (g > b) {
                sb.append(str).append(" is GOOD\n");
            } else if (g < b) {
                sb.append(str).append(" is A BADDY\n");
            } else {
                sb.append(str).append(" is NEUTRAL\n");
            }
        }

        System.out.println(sb);
    }
}