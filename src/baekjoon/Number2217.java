package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Number2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 로프의 개수

        Integer [] arr = new Integer[N];

        // 로프의 중량에 대한 배열 초기화
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 내림차순 정렬
        Arrays.sort(arr, Comparator.reverseOrder());

        int max = 0;

        // 병렬 연결로, 최소 중량의 로프 X 로프의 개수 만틈이 버틸 수 있는 중량
        for (int i=0; i<N; i++) {
            max = Math.max(max, arr[i]*(i+1));
        }

        System.out.println(max);
    }
}
