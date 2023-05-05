package chap02;

import java.util.Scanner;

public class Question4 {

    static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // 배열 a, b의 요솟수

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        copy(a, b);

        System.out.print("a배열 : ");
        for (int val : a) {
            System.out.print(val + " ");
        }

        System.out.println();

        System.out.print("b배열 : ");
        for (int val : b) {
            System.out.print(val + " ");
        }
    }
}
