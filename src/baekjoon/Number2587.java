package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        int sum = 0;
        int avg;
        int mid;

        // 배열 초기화
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);   // 배열 정렬

        avg = sum / 5;  // 평균값
        mid = arr[2];   // 중앙값

        System.out.println(avg);
        System.out.println(mid);
    }
}
