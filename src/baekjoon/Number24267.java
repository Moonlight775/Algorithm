package baekjoon;

import java.util.Scanner;

public class Number24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        // 1부터 n까지의 숫자중 3가지를 뽑아 중복 없이 크기 순으로 작성하는 경우의 수가 수행 횟수
        // nC3 = n!/(n-3)!X3! = (n-2)(n-1)n/6
        System.out.println((n * (n - 1) * (n - 2)) / 6);
        System.out.print(3);
    }
}