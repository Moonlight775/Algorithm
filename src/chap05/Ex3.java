package chap05;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 a의 크기는? : ");
        int num = sc.nextInt();

        int[] a = new int[num];

        for (int i=0; i<num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.println("최대 공약수는 " + gcdArray(a, 0, num) + "입니다.");
    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int r = x % y;

            x = y;
            y = r;
        }
        return x;
    }

    public static int gcdArray(int[] a, int index, int num) {
        if (num == 1) {
            return a[index];
        }
        else if (num == 2) {
            return gcd(a[index], a[index+1]);
        }
        else {
            return gcd(a[index], gcdArray(a, index+1, num-1));
        }
    }
}
