package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 입력된 자연수

        System.out.println(sequence(N));
    }

    public static int sequence(int num) {
        int cnt = 99;   // 1 ~ 100 까지는 그 수 자체로 수열을 이루기 때문에 99부터 카운트
        if (num < 100) {
            return num;
        }
        else {
            for (int i=100; i<=num; i++) {
                int hundred = i / 100;    // 백의 자리 수
                int ten = (i/10) % 10;    // 십의 자리 수
                int one = i % 10;         // 일의 자리 수

                if ((hundred - ten) == (ten - one)) {
                    cnt++;
                }
            }

        }
        return cnt;
    }
}
