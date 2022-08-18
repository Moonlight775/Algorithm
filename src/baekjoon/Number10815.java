package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 가지고 있는 숫자 카드 개수
        int[] arr = new int[N];     // 가지고 있는 숫자 카드 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 숫자 카드 배열 초기화
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());    // 비교할 숫자 카드 개수

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) {
            int key = Integer.parseInt(st.nextToken());
            sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(" "); // 상한과 하한을 빼면 key와 같은 수의 카드가 몇개인지 알 수 있다.
        }

        System.out.println(sb);
    }

    public static int lowerBound(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while (low < high) {    // low가 high와 같아지기 전까지
            int mid = low + ((high-low)/2);     // 중간 인덱스

            if (key <= arr[mid]) {  // 중간 값보다 입력된 수가 작다면
                high = mid;         // 상한을 내려준다. (상한을 왼쪽으로 당긴다)
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int upperBound(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + ((high-low)/2);

            if (key >= arr[mid]) {  // 중간 값보다 입력된 수가 크다면
                low = mid + 1;      // 하한을 올려준다. (하한을 오른쪽으로 당긴다)
            }
            else {
                high = mid;
            }
        }
        return high;
    }

}
