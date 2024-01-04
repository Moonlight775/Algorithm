package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 수의 개수
        int count = 0;      // 좋은 수의 개수
        long[] arr = new long[N];     // 수의 배열

        // 수의 배열 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);   // 배열 오름차순 정렬

        for (int k = 0; k < N; k++) {
            long find = arr[k];  // 두 개의 수의 합으로 나타낼 수 있는지 확인할 수
            int i = 0;      // front 포인터
            int j = N - 1;  // back 포인터

            while (i < j) {
                if (arr[i] + arr[j] == find) {
                    if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    } else {
                        count++;
                        break;
                    }
                } else if (arr[i] + arr[j] > find) {
                    j--;
                } else {
                    i++;
                }
            }
        }

        System.out.println(count);
        br.close();
    }
}