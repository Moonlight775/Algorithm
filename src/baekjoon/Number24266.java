package baekjoon;

import java.util.Scanner;

public class Number24266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        // 3중 for문으로 수행 횟수는 n^3이고 차수는 3이 된다.
        System.out.print(n * n * n + "\n" + 3);
    }
}