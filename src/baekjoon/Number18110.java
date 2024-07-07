package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 의견의 개수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int exclusion = (int) Math.round(arr.length * 0.15);    // 절사평균을 위해 제외하는 사람 명 수 (반올림)
        double sum = 0;     // 제외하는 의견 외의 합계

        for (int i = exclusion; i < n - exclusion; i++) {
            sum += arr[i];
        }

        int avg = (int) Math.round(sum / (n - exclusion * 2));  // 절사평균 값도 반올림

        System.out.println(avg);
    }
}