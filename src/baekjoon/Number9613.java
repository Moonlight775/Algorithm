package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());   // 수의 개수
            int[] arr = new int[n];     // 양의 정수 배열
            long sum = 0;    // 모든 gcd의 합

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    sum += gcd(arr[i], arr[j]);
                }
            }

            System.out.println(sum);
        }
    }

    // 최대공약수 구하기
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}