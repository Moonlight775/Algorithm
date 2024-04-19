package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 묘목의 수
        int[] tree = new int[N];    // 나무가 자라는 데 걸리는 날짜 배열
        int max = 0;                // 모든 나무가 자라는 날짜

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tree);  // 오름차순 정렬

        // 1일부터 자라는데 가장 오래 걸리는 나무부터 심는다.
        // 자라는데 가장 짧게 걸리는 나무를 심을때까지 반복하며
        // 심은 날 기준으로 나무가 다 자라는데 오래 걸린 날을 max에 저장한다.
        // i는 심은 날
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, i + tree[N - i]);
        }

        System.out.println(max + 1);
    }
}