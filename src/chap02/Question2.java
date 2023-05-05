package chap02;

import java.util.Scanner;
// 배열 요소에 값을 읽어 들여 역순으로 정렬한다.

public class Question2 {
    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length /2; i++) {
            System.out.println("a[" + i + "]과(와) a[" + (a.length-i-1) + "]를 교환합니다.");
            swap(a, i, a.length -i-1);

            for (int val : a) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[6];    // 요솟수가 num인 배열

        for(int i=0; i<6; i++) {
            x[i] = sc.nextInt();
            System.out.print(x[i] + " ");
        }
        System.out.println();

        reverse(x); // 배열 a의 요소를 역순으로 정렬

        System.out.println("역순정렬을 마쳤습니다.");
    }
}

