package baekjoon;

import java.util.Scanner;

public class Number24265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        // 알고리즘에서 j의 반복은 n-1, n-2, ..., 1번 돌게 된다.
        // 즉, (n-1) + (n-2) + ... + 1 이 수행 횟수가 된다.
        // 등차가 1인 등차수열의 합을 구해주면 되므로 공식에 대입하면 n(n-1)/2 가 된다.
        System.out.println((n * (n - 1)) / 2);
        System.out.println(2);  // 차수는 n^2으로 2가 된다.
    }
}