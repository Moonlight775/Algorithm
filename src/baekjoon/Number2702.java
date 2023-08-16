package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());   // 정수 a
            int b = Integer.parseInt(st.nextToken());   // 정수 b
            int r = gcd(a, b);  // 최대공약수

            // a * b / r = 최소공배수
           sb.append(a * b / r).append(" ").append(r).append('\n');
        }

        System.out.println(sb);
    }

    // 최대공약수 구하는 메서드 (유클리드 호제법)
    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
