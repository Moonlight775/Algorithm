package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number17103 {

    public static boolean[] prime = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        find_prime();

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;

            // i + (N - i) = N
            for (int i = 2; i <= N / 2; i++) {
                if (!prime[i]) {    // 소수
                    if (!prime[N - i]) {    // N-i도 소수
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    // 에라토스테네스의 체 알고리즘
    public static void find_prime() {
        prime[0] = prime[1] = true;     // true는 소수 아님

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}