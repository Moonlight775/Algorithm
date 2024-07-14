package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Number10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[1]); // 두 번째로 큰 정수 출력
    }
}