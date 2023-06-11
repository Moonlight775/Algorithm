package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Number5893 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();    // 이진수

        BigInteger NToDecimal = new BigInteger(N, 2);                 // 2진수 -> 10진수
        BigInteger result = NToDecimal.multiply(BigInteger.valueOf(17));   // 10진수 X 17

        System.out.println(result.toString(2));     // 10진수 -> 2진수 변환 후 출력
    }
}
