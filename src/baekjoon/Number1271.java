package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Number1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());

        System.out.println(A.divide(B));
        System.out.println(A.remainder(B));
    }
}
