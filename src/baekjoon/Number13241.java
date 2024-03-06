package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long d = gcd(a, b);

        System.out.println(a * b / d);
    }

    // 최대공약수 반복문 방식
    public static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;     // 나머지

            // GCD(a, b) = GCD(b, r)이므로 변환
            a = b;
            b = r;
        }

        return a;
    }
}