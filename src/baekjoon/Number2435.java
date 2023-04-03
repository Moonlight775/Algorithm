package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 온도 측정한 날짜 수
        int K = Integer.parseInt(st.nextToken());   // 합을 구하기 위한 연속적인 날짜
        int[] arr = new int[N];     // 온도 배열

        // 온도 배열 초기화
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum;    // 온도의 합
        int max = Integer.MIN_VALUE;    // 합 최대 값
        for (int i = 0; i <= N - K; i++) {
            sum = 0;
            for (int j = i; j < i + K; j++) {
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
