package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());    // 집합 S의 크기
        int[] arr = new int[L]; // 집합 S 배열

        // 집합 S 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<L; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);   // 집합 S 오름차순정렬

        int n = Integer.parseInt(br.readLine());    // 집합에 포함된 정수

        int start = 0;  // n과 근접한 작은 값
        int end = 1000; // n과 근접한 큰 값

        // n과 근접한 값을 찾기
        for (int val : arr) {
            if (val < n) {
                if (val > start) {
                    start = val;
                }
            }
            else if (val > n) {
                if (val < end) {
                    end = val;
                }
            }
            else {  // n과 같은 값이라면 0 출력
                System.out.println(0);
                return;
            }
        }

        // 직접 좋은 구간을 써보면 쉽게 규칙을 찾을 수 있다.
        // n-start를 이해하기 위해 예시2를 보면 [9, ~], [10, ~] 부분과 같다.
        // end-n 은 [~, 10],[~, 11].[~, 12] 부분이다.
        // 이 중 [n, n]은 제외해야 하므로 -1을 해준다.
        System.out.println(((n-start)*(end-n))-1);
    }
}
