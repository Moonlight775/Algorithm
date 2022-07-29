package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   // 나무의 수
        int M = Integer.parseInt(st.nextToken());   // 가져가려는 나무의 길이

        int[] arr = new int[N];

        int min = 0;
        int max = 0;    // 가장 높은 나무

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        while (min < max) {     // 상한선이 하한선보다 높을 경우
            int mid = (min + max) / 2;
            long sum = 0;

            for (int treeHeight : arr) {
                if (treeHeight - mid > 0) {     // 자르는 위치가 나무 높이보다 높을 수 있으므로 0 이상일 때만
                    sum += (treeHeight - mid);
                }
            }

            if (sum < M) {      // 합이 가져가려는 길이보다 작다면 상한선을 낮춰준다.
                max = mid;
            }
            else {              // 합이 가져가려는 길이보다 크다면 하한선을 높여준다.
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }
}
