package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Number2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3]; // 입력받는 3가지 수를 담을 배열

        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();  // 배열에 숫자 담기
        }
        Arrays.sort(arr);   // 오름차순해주기 위한 정렬

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
