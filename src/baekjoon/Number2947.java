package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];
        int[] compare = {1, 2, 3, 4, 5};

        // 나무 조각 순서 초기화
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        while (true) {
            // 조건에 맞게 순서 변경
            for (int i = 0; i < 4; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i+1] = temp;
                    break;
                }
            }

            // 출력
            for (int val : arr) {
                sb.append(val).append(" ");
            }

            // 1, 2, 3, 4, 5 순서에 맞다면 종료
            if (Arrays.equals(arr, compare)) {
                break;
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}
