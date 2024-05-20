package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2960 {

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        make_prime(N, K);
    }

    // N 이하 소수 생성 메소드
    public static void make_prime(int N, int K) {
        prime = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            if (prime[i]) continue; // 이미 체크됐다면 스킵

            for (int j = i; j <= N; j += i) {
                if (!prime[j]) {
                    prime[j] = true;
                    K--;
                    if (K == 0) {
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
    }
}