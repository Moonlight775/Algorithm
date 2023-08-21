package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str = br.readLine().toCharArray();
        int num = 0;    // 알파벳 수의 합

        for (char c : str) {
            if (Character.isUpperCase(c)) {
                num += c - 'A' + 27;
            } else {
                num += c - 'a' + 1;
            }
        }

        is_prime(num);
    }

    // 소수 판별 메소드
    static void is_prime(int num) {
        // 이 문제에서는 편의상 1도 소수로 인정
        if (num == 1 || num == 2) {
            System.out.println("It is a prime word.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            // 소수가 아닐경우
            if (num % i == 0) {
                System.out.println("It is not a prime word.");
                return;
            }
        }

        System.out.println("It is a prime word.");
    }
}