package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Number1837 {

    static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger P = new BigInteger(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        prime = new boolean[K+1];

        // K 이하의 소수 찾기
        for (int i=2; i<=K; i++) {
            make_prime(i);
        }

        for (int i=2; i<K; i++) {
            if(!prime[i]) continue; // 소수가 아니라면 스킵

            BigInteger val = new BigInteger(Integer.toString(i));
            // P와 K 이하의 소수를 나눴을 때 나누어떨어진다면 좋지 않은 암호
            // BigInteger - compareTo는 비교 값이 동일하면 0 반환
            if (P.mod(val).compareTo(BigInteger.ZERO) == 0) {
                System.out.println("BAD " + val);
                return;
            }
        }

        System.out.println("GOOD");
    }

    // 소수 찾는 메서드
    public static void make_prime(int num) {
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0) {
                return;
            }
        }

        prime[num] = true;  // 소수라면 true
    }
}
