package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Number3047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];     // 세 수를 담을 배열
        // 배열 초기화
        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);   // A, B, C가 오름차순 순이므로 오름차순으로 정렬

        String str = sc.next();     // 출력할 순서의 문자열

        // 문자열에 맞는 순서로 출력
        for (int i = 0; i < 3; i++) {
            String[] S = str.split("");

            if (S[i].equals("A")) {
                System.out.print(num[0] + " ");
            } else if (S[i].equals("B")) {
                System.out.print(num[1] + " ");
            } else {
                System.out.print(num[2] + " ");
            }
        }

    }
}
