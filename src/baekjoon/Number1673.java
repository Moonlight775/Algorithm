package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();

            if (input == null) break;

            StringTokenizer st = new StringTokenizer(input);
            int n = Integer.parseInt(st.nextToken());   // 치킨 쿠폰
            int k = Integer.parseInt(st.nextToken());   // 도장 개수

            int count = 0;  // 치킨 개수
            int coupon;
            int newCount;

            while (true) {
                newCount = (n - n % k);
                coupon = newCount / k;
                n = n % k;
                n += coupon;
                count += newCount;

                if (n < k) {
                    count += n;
                    break;
                }
            }

            System.out.println(count);
        }
    }
}
