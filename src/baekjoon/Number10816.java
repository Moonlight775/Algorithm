package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 카드의 개수
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());    // 찾을 정수의 개수

        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<M; i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(upperBound(arr, key) - lowerBound(arr, key)).append('\n');    // upperBound와 lowerBound의 차이 값이 중복된 원소의 개수이다.
        }
        System.out.println(sb);
    }

    public static int lowerBound(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while (low < high) {    // low가 high랑 같아질 때 까지 반복
            int mid = low + ((high-low) / 2);   // 중간 인덱스를 구한다.

            // key 값이 중간 인덱스 값보다 작거나 같을 경우 (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
            if (key <= arr[mid]) {
                high = mid;
            }
            else {              // 중간 인덱스 값이 key 값보다 작아질 경우
                low = mid + 1;  // 중간 인덱스가 key보다 작아지기 시작한 인덱스가 되므로 하한을 +1 해준 값이 왼쪽 끝의 key 인덱스가 된다.
            }

        }
        return low;
    }

    public static int upperBound(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while (low < high) {    // low가 high랑 같아질 때 까지 반복
            int mid = low + ((high-low) / 2);   // 중간 인덱스를 구한다.

            // key 값이 중간 인덱스 값보다 크거나 같을 경우 (중복 원소에 대해 오른쪽으로 탐색하도록 하계를 올린다.)
            if (key >= arr[mid]) {
                low = mid + 1;
            }
            else {              // 중간 인덱스 값이 key 값보다 커질 경우
                high = mid;     // 중간 인덱스가 key값보다 커지는 인덱스이다.
            }

        }
        return high;
    }
}
