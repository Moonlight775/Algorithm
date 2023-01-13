package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   // 수열의 크기
        int K = Integer.parseInt(st.nextToken());   // 반복 횟수

        int[] arr = new int[N];

        // 수열 초기화
        st = new StringTokenizer(br.readLine(), ",");
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // K번 반복
        for (int i=1; i<=K; i++) {
            // 반복에 따라 계속 계산
            for (int j=0; j<N-i; j++) {
                arr[j] = arr[j+1] - arr[j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N-K-1; i++) {
            sb.append(arr[i]).append(",");
        }
        sb.append(arr[N-K-1]);

        System.out.println(sb);
    }
}
