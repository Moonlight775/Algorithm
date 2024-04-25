package baekjoon;

import java.util.Scanner;

public class Number3049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 대각선 2개가 만나야 교차점이 생김
        // 대각선 2개를 만드려면 꼭지점 4개가 필요
        // n개의 꼭지점 중 4개의 꼭지점을 순서없이 고르는 연산 = nC4
        System.out.println(N*(N-1)*(N-2)*(N-3)/24);
    }
}