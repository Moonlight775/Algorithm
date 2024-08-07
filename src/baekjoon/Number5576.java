package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Number5576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] W = new int[10];  // W 대학 점수
        int[] K = new int[10];  // K 대학 점수

        // W 대학 점수 초기화
        for (int i = 0; i < 10; i++) {
            W[i] = sc.nextInt();
        }

        // K 대학 점수 초기화
        for (int i = 0; i < 10; i++) {
            K[i] = sc.nextInt();
        }

        // 오름차순 정렬
        Arrays.sort(W);
        Arrays.sort(K);

        // 높은 점수 3개의 합을 출력
        System.out.println(W[7] + W[8] + W[9]);
        System.out.println(K[7] + K[8] + K[9]);
    }
}