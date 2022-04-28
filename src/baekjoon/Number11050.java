package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());    // 자연수 N
        int K = Integer.parseInt(st.nextToken());    // 정수 K

        // nCk = N! / (N-K)!K!
        System.out.println(factorial(N) / (factorial(N-K) * factorial(K)));
    }

    static int factorial(int N) {
        if (N <= 1) return 1;   // 0! = 1

        return N * factorial(N-1);  // 재귀
    }
}
