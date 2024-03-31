package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number5347 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long gcd = findGcd(a, b);    // 최대공약수

            System.out.println((a * b) / gcd);  // 최소공배수 출력
        }
    }

    public static long findGcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            // GCD(a, b) = GCD(b, r)이므로 변환
            a = b;
            b= r;
        }
        return a;   // a가 최대공약수
    }
}