package baekjoon;

import java.util.Scanner;

public class Number15439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 정수

        // 상의(N가지)를 골랐다면 하의는 상의 색과 다른(N-1가지) 색을 고르면 된다.
        System.out.println(N * (N - 1));
    }
}