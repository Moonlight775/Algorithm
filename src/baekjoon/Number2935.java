package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Number2935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.next());   // 양의 정수 A
        String symbol = sc.next();  // 연산자
        BigInteger B = new BigInteger(sc.next());   // 양의 정수 B
        BigInteger result;    // 결과 값

        if (symbol.equals("+")) {   // 덧셈이면
            result = A.add(B);
        } else {    // 곱셈이면
            result = A.multiply(B);
        }

        System.out.println(result);
    }
}