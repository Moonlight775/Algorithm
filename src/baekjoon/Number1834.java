package baekjoon;

import java.util.Scanner;

public class Number1834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long sum = 0;

        for (long i=1; i<N; i++) {
            sum += (N+1)*i;
        }

        System.out.println(sum);
    }
}
