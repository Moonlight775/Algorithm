package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number4592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());   // 입력된 수의 개수

            if (N == 0) break;

            int[] arr = new int[N];     // 입력된 수의 배열

            // 배열 초기화
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < N - 1; i++) {
                if (arr[i] == arr[i+1]) continue;   // 다음에 같은 수가 반복된다면
                sb.append(arr[i]).append(" ");
            }

            sb.append(arr[N-1]).append(" ").append("$").append('\n');
        }

        System.out.println(sb);
    }
}
