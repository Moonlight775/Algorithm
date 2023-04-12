package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();

            if (input == null) break;

            StringTokenizer st = new StringTokenizer(input);
            int n = Integer.parseInt(st.nextToken());   // 치킨 쿠폰
            int k = Integer.parseInt(st.nextToken());   // 도장 개수

            int count = 0;
            count += n;

            while (n >= k) {
                n /= k;
                count += n;
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
