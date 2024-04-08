package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Number14623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger B1 = sc.nextBigInteger(2);
        BigInteger B2 = sc.nextBigInteger(2);

        BigInteger result = B1.multiply(B2);

        System.out.println(result.toString(2));
    }
}