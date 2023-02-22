package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number1837 {

    static ArrayList<Integer> prime = new ArrayList<>();
    static BigInteger val;
    static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger P = new BigInteger(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // K 이하의 소수 찾기
        for (int i=2; i<=K; i++) {
            make_prime(i);
        }

        for (int i=0; i<prime.size(); i++) {
            val = BigInteger.valueOf(prime.get(i));
            BigInteger remain = P.mod(val);
            long int_remian = remain.longValue();

            if (int_remian == 0) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.printf("%S %d", "BAD", val);
        }
        else {
            System.out.println("GOOD");
        }
    }

    // 소수 찾는 메서드
    public static void make_prime(int num) {
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0) {
                return;
            }
        }
        prime.add(num);
    }
}
