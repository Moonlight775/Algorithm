package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number7510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];     // 정수 배열

            // 세 정수 배열 초기화
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);   // 오름차순 정렬

            // a^2 + b^2 = c^2 이면 직각 삼각형
            if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
                sb.append("Scenario #").append(i + 1).append(":").append('\n').append("yes").append("\n\n");
            } else {
                sb.append("Scenario #").append(i + 1).append(":").append('\n').append("no").append("\n\n");
            }
        }

        System.out.println(sb);
    }
}