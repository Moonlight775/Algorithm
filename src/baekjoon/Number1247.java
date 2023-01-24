package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Number1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = 3;

        StringBuilder sb = new StringBuilder();
        while (repeat-- >0) {
            int N = Integer.parseInt(br.readLine());

            BigInteger sum = new BigInteger("0");

            for (int i=0; i<N; i++) {
                BigInteger num = new BigInteger(br.readLine());
                sum = sum.add(num);
            }

            if (sum.compareTo(BigInteger.ZERO) < 0) { // 음수
                sb.append("-").append('\n');
            }
            else if (sum.compareTo(BigInteger.ZERO) > 0) { // 양수
                sb.append("+").append('\n');
            }
            else {
                sb.append(0).append('\n');
            }
        }

        System.out.println(sb);
    }
}
