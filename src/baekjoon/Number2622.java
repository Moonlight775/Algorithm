package baekjoon;

import java.util.Scanner;

public class Number2622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int a = 1; a <= N / 3; a++) {
            for (int b = a; b <= N - a - b; b++) {
                int c = N - a - b;
                if (a + b > c) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
