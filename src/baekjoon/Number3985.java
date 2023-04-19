package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number3985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());    // 롤케이크 길이
        int N = Integer.parseInt(br.readLine());    // 방청색의 수

        int[] cake = new int[L + 1];    // 1m단위 케이크 배열
        int[][] arr = new int[N][2];    // 방청객에 따른 P~K 배열

        // P~K 범위 초기화
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int expectMax = 0;  // 예상치의 최대 케이크 조각
        int expectNum = 0;  // 예상치의 방청객 번호

        for (int i = N - 1; i >= 0; i--) {
            int count = (arr[i][1] - arr[i][0]);    // K-P, 케이크 조각 수

            if (count >= expectMax) {   // 케이크 조각이 최대값보다 크다면
                expectMax = count;
                expectNum = i + 1;  // 배열은 0부터 시작이므로 +1
            }

            for (int j = arr[i][0]; j <= arr[i][1]; j++) {  // 조건 범위 P~K
                cake[j] = i + 1;
            }
        }

        int max = 0;    // 실제 최대 케이크 조각
        int max_number = 0; // 실제 가장 많은 케이크 조각을 받는 방청객의 번호

        for (int i = 1; i <= N; i++) {
            int count = 0;

            for (int j = 0; j <= L; j++) {
                if (cake[j] == i) {     // 케이크를 차지한 방청객번호
                    count++;
                }
            }

            if (max < count) {
                max = count;
                max_number = i;
            }
        }

        System.out.println(expectNum);
        System.out.println(max_number);
    }
}
