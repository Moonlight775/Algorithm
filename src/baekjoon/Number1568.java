package baekjoon;

import java.util.Scanner;

public class Number1568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i = 1;
        int count = 0;

        while (N > 0) {
            N = N - i;
            i++;

            if (i > N) {
                i = 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
