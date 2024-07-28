package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];     // N개의 정수 저장 배열

        // N 배열 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);   // N 배열 오름차순 정렬

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            boolean find = false;   // N 배열에 찾는 값이 있었다면 true, 아니라면 false
            int target = Integer.parseInt(st.nextToken());  // N 배열에 값이 있는지 찾을 값

            // 이진 탐색 시작
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int midi = (start + end) / 2;   // 중간 인덱스 middleIndex
                int midV = arr[midi];   // 중간 인덱스 값 middleValue

                if (midV > target) {    // 타겟값이 중간 인덱스 값보다 작다면
                    end = midi - 1;     // 중간 인덱스보다 왼쪽에 값이 있다는 것으로 중간값 기준으로 왼쪽 데이터셋을 선택
                }
                else if (midV < target) {   // 타겟값이 중간 인덱스 값보다 크다면
                    start = midi + 1;       // 중간 인덱스보다 오른쪽에 값이 있다는 것으로 중간값 기준으로 오른쪽 데이터셋을 선택
                }
                else {  // 중간값 == 타겟값이면 탐색 종료
                    find = true;
                    break;
                }
            }

            if (find) {
                sb.append(1).append('\n');
            }
            else {
                sb.append(0).append('\n');
            }
        }

        System.out.println(sb);
    }
}