package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numerator1 = Integer.parseInt(st.nextToken());      // 첫 번째 분수의 분자
        int denominator1 = Integer.parseInt(st.nextToken());    // 첫 번째 분수의 분모

        st = new StringTokenizer(br.readLine());

        int numerator2 = Integer.parseInt(st.nextToken());      // 두 번재 분수의 분자
        int denominator2 = Integer.parseInt(st.nextToken());    // 두 번째 분수의 분모

        int result_nume = numerator1 * denominator2 + numerator2 * denominator1;    // 분자는 다른 분수의 분모로 곱해주고 더해준다.
        int result_deno = denominator1 * denominator2;  // 분모는 곱해준다

        // 최종 분수를 기약분수로 만들어주기 위해 분자, 분모에 최대 공약수로 나누어준다.
        System.out.println(result_nume / gcd(result_nume, result_deno) + " " + result_deno / gcd(result_nume, result_deno));

    }
    // 최대 공약수 구하기
    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }

        return a;
    }

}
