package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 수열의 길이
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 1;
        int up_count = 1;
        int down_count = 1;

        for (int i = 1; i < N; i++) {
            // 증가
            if (arr[i] >= arr[i - 1]) {
                up_count++;
            }
            else {
                up_count = 1;
            }

            // 감소
            if (arr[i] <= arr[i - 1]) {
                down_count++;
            }
            else {
                down_count = 1;
            }

            max = Math.max(max, Math.max(up_count, down_count));
        }

        System.out.println(max);
    }
}