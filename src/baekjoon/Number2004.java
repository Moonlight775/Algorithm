package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // nCm = n! / (n-m)!m!
        // n! = {2^a1, 5^a2}, n-m! = {2^b1, 5^b2}, m! = {2^c1, 5^c2}
        // 2의 승수 (a1 - b1 - c1), 5의 승수 (a2 - b2 - c2)
        int count_five = fivePow(n) - fivePow(n-m) - fivePow(m);
        int count_two = twoPow(n) - twoPow(n-m) - twoPow(m);

        System.out.println(Math.min(count_five, count_two));
    }

    // 5의 승수 개수 찾기
    public static int fivePow(long num) {
        int count = 0;

        while (num >= 5) {
            count += num / 5;
            num /= 5;
        }

        return count;
    }

    // 2의 승수 개수 찾기
    public static int twoPow(long num) {
        int count = 0;

        while (num >= 2) {
            count += num / 2;
            num /= 2;
        }

        return count;
    }
}
