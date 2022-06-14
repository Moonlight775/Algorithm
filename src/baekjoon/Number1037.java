package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());   // 약수의 개수
        int max = Integer.MIN_VALUE;    // 정수 최소값, -2147483648
        int min = Integer.MAX_VALUE;    // 정수 최대값, 2147483647

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<number; i++) {
            int A = Integer.parseInt(st.nextToken());   // 진짜 약수

            max = Math.max(A, max);    // 첫 약수는 정수 최소값보다 크므로 max가 초기화된다.
            min = Math.min(A, min);    // 첫 약수는 정수 최대값보다 크므로 min가 초기화된다.
        }

        System.out.println(min * max);
    }
}
