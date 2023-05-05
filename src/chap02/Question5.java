package chap02;

import java.util.Scanner;

public class Question5 {

    // 역순으로 복사하는 메서드
    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 배열 a, b의 요솟수

        int[] a = new int[n];  // 요솟수가 na인 a 배열
        int[] b = new int[n];  // 요솟수가 na와 같은 b 배열

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        rcopy(a, b);

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
