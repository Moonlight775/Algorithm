package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int C = Integer.parseInt(br.readLine());    // 거스름돈

            int quarter = C / 25;
            C = C % 25;

            int dime = C / 10;
            C = C % 10;

            int nickel = C / 5;
            C = C % 5;

            sb.append(quarter).append(" ").append(dime).append(" ").append(nickel).append(" ").append(C).append('\n');
        }

        System.out.println(sb);
    }
}