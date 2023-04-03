package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Number1252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 2진수 -> 10진수 변환
        BigInteger num1 = new BigInteger(st.nextToken(), 2);
        BigInteger num2 = new BigInteger(st.nextToken(), 2);

        BigInteger sum = num1.add(num2);

        // 2진수로 다시 변환하여 출력
        System.out.println(sum.toString(2));
    }
}
