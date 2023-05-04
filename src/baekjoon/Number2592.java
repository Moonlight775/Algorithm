package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[1001];  // 수의 배열
        int sum = 0;    // 누적합
        int max = 0;    // 입력된 수 중 최댓값
        int mode = 0;   // 최빈값

        // 배열, 누적합 및 최댓값 초기화
        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(br.readLine());

            arr[index]++;

            sum += index;   // 누적 합

            if (max < index) {
                max = index;
            }
        }

        int mode_max = 0;   // 최빈값의 최댓값

        // 조건범위를 줄이기 위해 max 사용
        for (int i = 10; i <= max; i += 10) {
            if (mode_max < arr[i]) {
                mode_max = arr[i];
                mode = i;
            }
        }

        System.out.println(sum / 10);   // 평균
        System.out.println(mode);
    }
}
