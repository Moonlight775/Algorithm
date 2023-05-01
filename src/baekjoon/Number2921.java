package baekjoon;

import java.util.Scanner;

public class Number2921 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 도미노 세트의 크기
        int count = 3;  // 점의 개수
        int gap = 9;    // 세트 별 추가되는 점
        int plus = 9;   // 추가되는 점의 증가 폭

        for (int i = 1; i < N; i++) {
            count += gap;

            gap += plus;
            plus += 3;
        }

        System.out.println(count);
    }
}