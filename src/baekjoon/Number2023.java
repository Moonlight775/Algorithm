package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2023 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        // 일의 자리 소수는 2, 3, 5, 7 이므로 4개 수에서만 시작
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    static void DFS(int num, int digit) {
        if (digit == N) {   // 자릿수가 N자리면
            if (isPrime(num)) {
                System.out.println(num);
            }

            return;
        }

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {   // 짝수라면 더 이상 탐색할 필요 없음
                continue;
            }

            if (isPrime(num * 10 + i)) {    // 소수라면 재귀 함수로 자릿수를 늘림
                DFS(num * 10 + i, digit + 1);
            }
        }
    }

    // 소수 판별
    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}