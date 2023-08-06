package chap06;

import chap04.IntStack;

import java.util.Scanner;

public class QuickSortVerbose {
    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 퀵 정렬(비재귀 버전)
    static void quickSort(int[] a, int left, int right) {
        IntStack lstack = new IntStack(right - left + 1);
        IntStack rstack = new IntStack(right - left + 1);

        lstack.push(left);
        rstack.push(right);
        System.out.printf("a[%d] ~ a[%d]를 분할하는 문제를 스택에 푸시합니다.\n", left, right);
        System.out.print("Lstack: ");
        lstack.dump();
        System.out.print("Rstack: ");
        rstack.dump();

        while (!lstack.isEmpty()) {
            int pl = left = lstack.pop();   // 왼쪽 커서
            int pr = right = rstack.pop();  // 오른쪽 커서
            int x = a[(left + right) / 2];  // 피벗 (중앙 요소)
            System.out.printf("스택에서 분할하는 문제를 꺼냈습니다. a[%d] ~ a[%d]를 분할합니다.\n", left, right);

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if (pl <= pr) {
                    swap(a, pl++, pr--);
                }
            } while (pl <= pr);

            if (left < pr) {
                lstack.push(left);      // 왼쪽 그룹 범위의
                rstack.push(pr);        // 인덱스를 푸시합니다.
                System.out.printf("a[%d] ~ a[%d]를 분할하는 문제를 스택에 푸시합니다.\n", left, pr);
                System.out.print("Lstack: ");
                lstack.dump();
                System.out.print("Rstack: ");
                rstack.dump();
            }
            if (pl < right) {
                lstack.push(pl);        // 오른쪽 그룹 범위의
                rstack.push(right);     // 인덱스를 푸시합니다.
                System.out.printf("a[%d] ~ a[%d]를 분할하는 문제를 스택에 푸시합니다.\n", pl, right);
                System.out.print("Lstack: ");
                lstack.dump();
                System.out.print("Rstack: ");
                rstack.dump();
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        quickSort(x, 0, nx - 1);    // 배열 x를 퀵 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
