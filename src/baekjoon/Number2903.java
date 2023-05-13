package baekjoon;

import java.util.Scanner;

public class Number2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 거친 과정 횟수

        // 정사각형 한 변에 점이 몇 개씩 증가되는지 확인
        // 한 변에 있는 점의 개수의 제곱이 모든 점의 개수
        // 점의 개수는 첫항(초기상태)이 2(한 변의 점 개수)인 등비수열과 같다.
        int a = 2;  // 첫항
        int r = 1;  // 공비

        for (int i = 0; i < N; i++) {
            a += r;
            r *= 2;
        }

        System.out.println((int)Math.pow(a, 2));
    }
}
