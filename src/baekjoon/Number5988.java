package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Number5988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 숫자의 개수

        while (N-- > 0) {
            BigInteger K = new BigInteger(sc.next());   // 확인할 정수

            if (K.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) {   // 2로 나누어 나머지가 0이라면 짝수
                System.out.println("even");
            } else {            // 아니라면 홀수
                System.out.println("odd");
            }
        }
    }
}
