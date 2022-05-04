package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 수의 개수
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());   // 입력되는 수로 배열 초기화
        }

        Arrays.sort(arr);   // 오름차순 정렬

        for (int i : arr) {
            System.out.println(i);  // 정렬된 배열 출력
        }
    }
}
