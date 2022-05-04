package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int d = gcd(a, b);

        System.out.println(d);      // 최대공약수
        System.out.println(a*b/d);  // 최소공배수
    }

    public static int gcd (int a, int b) {
        while (b != 0) {
            int r = a % b;  // r = 나머지

            // GCD(a, b) = GCD(b, r)이므로 변환
            a = b;
            b = r;
        }
        return a;   // a가 최대공약수
    }
}
