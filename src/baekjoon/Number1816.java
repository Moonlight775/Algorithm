package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 수의 개수

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            boolean flag = true;

            // 소인수가 10^6보다 작다면 적절하지 못한 암호 키
            for (int j = 2; j <= 1000000; j++) {
                if (num % j == 0) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            }
        }
    }
}