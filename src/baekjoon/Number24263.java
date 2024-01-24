package baekjoon;

import java.util.Scanner;

public class Number24263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // O(n)으로 n번 수행하게 되어 n을 그대로 출력하면 되고,
        // n번 실행함로 n의 1승으로 차수는 1이다.
        System.out.println(n + "\n1");
    }
}