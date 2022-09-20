package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 사람 수
        int[] arr = new int[N];     // 인출 시간 배열

        // 배열 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;    // 순서대로 인출 시 필요한 시간
        int result = 0; // 총 시간의 합

        Arrays.sort(arr);   // 오름차순 정렬해야 최솟값이 구해짐

        for (int i=0; i<N; i++) {
            sum += arr[i];
            result += sum;
        }

        System.out.println(result);
    }
}
