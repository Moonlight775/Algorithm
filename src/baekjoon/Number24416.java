package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number24416 {

    static int count = 0;       // 재귀 호출 횟수
    static int dp_count = 0;    // 동적 프로그래밍 호출 횟수
    static int[] f;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        f = new int[n+1];

        fib(n);
        fibonacci(n);

        System.out.print(count + " " + dp_count);
    }

    // 재귀호출
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            count++;
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    // 동적 프로그래밍
    public static int fibonacci(int n) {
        f[0] = f[1] = 1;

        for (int i=2; i<n; i++) {
            dp_count++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
