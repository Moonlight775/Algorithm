package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number10539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 수열 B의 길이
        int[] B = new int[N + 1];
        int[] A = new int[N + 1];

        // B배열 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        A[1] = B[1];    // 첫 번째 요소는 동일
        int sum = 0;

        // n = (현재 항 * B수열 현재 항의 값) - (현재 항 전까지의 A수열 값의 합)
        for (int i = 2; i <= N; i++) {
            A[i] = (i * B[i]) - (sum += A[i - 1]);
        }

        for (int i = 1; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}