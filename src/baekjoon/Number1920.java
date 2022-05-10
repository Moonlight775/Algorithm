package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1920 {

    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());  // 배열 입력받은 수로 초기화
        }

        Arrays.sort(arr);   // 이분 탐색 전에 반드시 정렬되어 있어야 한다.

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<M; i++) {
            if (binarySearch(Integer.parseInt(st.nextToken())) >= 0) {  // 찾는 값이 있을 경우
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }

        System.out.println(sb);
    }

    public static int binarySearch(int key) {
        int low = 0;                        // 탐색 범위의 왼쪽 끝 인덱스
        int high = arr.length - 1;          // 탐색 범위의 오른쪽 끝 인덱스

        while (low <= high) {               // low가 high보다 크거나 같아지기 전까지

            int mid = (low + high) / 2;     // 중간 인덱스

            if (key < arr[mid]) {           // key값이 중간 인덱스 값보다 작을 경우
                high = mid - 1;             // 중간 인덱스보다 작은 쪽에 key가 있으므로 high 값을 변경해준다.
            } else if (key > arr[mid]) {    // key값이 중간 인덱스 값보다 클 경우
                low = mid + 1;              // 중간 인덱스보다 큰 쪽에 key가 있으므로 low 값을 변경해준다.
            } else {                        // key값이 중간 인덱스 값과 같을 경우
                return mid;
            }
        }

        return -1;                          // 찾고자 하는 값이 존재하지 않을 경우
    }
}
