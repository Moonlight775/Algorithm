package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 수열의 크기
        int[] arr = new int[n];     // 수열 배열

        // 수열 배열 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);   // 수열 오름차순 정렬

        int x = Integer.parseInt(br.readLine());
        int i = 0;      // left 포인터
        int j = n - 1;  // right 포인터
        int result = 0; // 조건에 맞는 개수

        while (i < j) {
            if (arr[i] + arr[j] == x) {
                result++;
                i++;
                j--;
            } else if (arr[i] + arr[j] < x) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println(result);
    }
}
