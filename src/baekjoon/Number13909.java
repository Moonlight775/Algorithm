package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 창문의 개수와 사람의 수
        int count = 0;

        // 약수의 개수가 홀수인 경우 마지막에 창문을 연다.
        // 제곱수일 경우 약수의 개수가 홀수이다.
        for (int i = 1; i * i <= N; i++) {
            count++;
        }

        System.out.println(count);
    }
}