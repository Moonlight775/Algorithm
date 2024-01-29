package baekjoon;

import java.util.Scanner;

public class Number24264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        // 이중 for문은 N^2번 수행되므로 시간 복잡도는 O(N^2) 이다.
        // n^2이므로 차수는 2가 된다.
        System.out.println((n * n) + "\n2");
    }
}