package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 수의 개수
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;  // 시작 index
        int end = 0;    // 끝 index
        int sum = 0;
        int count = 0;

        while (true) {
            // 합이 M보다 커진다면 sum을 줄여야 하므로 start index를 높여서 값을 맞춤
            if (sum > M) {
                sum -= arr[start++];
            }
            // end index가 끝까지 가면 종료
            else if (end == N) break;
            // sum이 M보다 작다면 end index를 1씩 증가하며 합을 증가시킴
            else {
                sum += arr[end++];
            }

            if (sum == M) {
                count++;
            }
        }

        System.out.println(count);
    }
}
