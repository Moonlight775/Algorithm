package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Number4150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N < 2) {
            System.out.println(1);
            return;
        }

        BigInteger[] bigNum = new BigInteger[N + 1];
        bigNum[1] = BigInteger.ONE;
        bigNum[2] = BigInteger.ONE;

        // 피보나치 수
        for (int i = 3; i <= N; i++) {
            bigNum[i] = bigNum[i - 1].add(bigNum[i - 2]);
        }

        System.out.println(bigNum[N]);
    }
}