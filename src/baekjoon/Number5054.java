package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number5054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());    // 상점의 수
            int[] store = new int[n];
            int sum = 0;    // 상점 좌표의 합

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < store.length; i++) {
                store[i] = Integer.parseInt(st.nextToken());
                sum += store[i];
            }

            int avg = sum / n;  // 상점 좌표의 중간값(평균)

            Arrays.sort(store);     // 오름차순 정렬

            // 중간에 주차 후 가장 왼편의 가게로 걷는 거리 + 오른쪽 맨 끝 가게에서 다시 중간으로 가는 거리
            int result = (avg - store[0]) + (store[n - 1] - avg);

            // 왼쪽 첫 번째 가게부터 시작하여 끝 가게까지 걷는 거리
            for (int i = 1; i < n; i++) {
                result += store[i] - store[i - 1];
            }

            System.out.println(result);
        }
    }
}