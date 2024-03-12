package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 가로수의 수

        int[] tree = new int[N];

        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;    // 가로수 간격의 최대 공약수

        for (int i = 0; i < N - 1; i++) {
            int distance = tree[i + 1] - tree[i];
            gcd = getGcd(distance, gcd);
        }

        // tree[N-1] - tree[0] / gcd 는 가로수 간격의 개수
        // 가로수의 수는 간격의 개수 + 1
        // 새로 심어야 하는 가로수의 개수는 총 가로수의 개수 - 기존 가로수의 수
        System.out.println((tree[N - 1] - tree[0]) / gcd + 1 - (tree.length));
    }

    // 최대 공약수 구하기
    public static int getGcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}