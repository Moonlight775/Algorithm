package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number4619 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int B = Integer.parseInt(st.nextToken());   // 양의 정수
            int N = Integer.parseInt(st.nextToken());   // 제곱 수

            if (B == 0 && N == 0) break;

            // B와 근접한 A값을 저장할 변수
            int num1 = 0;   // B보다 작거나 같은 근사치
            int num2 = 0;   // B보다 큰 근사치

            int A = 1;

            while (true) {
                if (Math.pow(A, N) <= B) {
                    num1 = A;
                } else if (Math.pow(A, N) > B) {
                    num2 = A;
                    break;
                }
                A++;
            }

            int result = (Math.abs(Math.pow(num1, N) - B)) <= (Math.abs(Math.pow(num2, N) - B)) ? num1 : num2;

            System.out.println(result);
        }

    }
}