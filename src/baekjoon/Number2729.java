package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Number2729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            BigInteger num1 = new BigInteger(st.nextToken(), 2);
            BigInteger num2 = new BigInteger(st.nextToken(), 2);

            System.out.println(num1);
            System.out.println(num2);

            BigInteger num = num1.add(num2);

            sb.append(num.toString(2)).append('\n');
        }

        System.out.println(sb);
    }
}