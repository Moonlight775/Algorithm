package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 재료의 개수
        int M = Integer.parseInt(br.readLine());    // 필요한 수

        int[] arr = new int[N]; // 재료를 담을 배열

        // 재료 배열 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i=0; i<N-1; i++) {
            for (int j=i+1; j<N; j++) {
                // 두 재료의 합이 M과 같다면 +1
                if (arr[i]+arr[j] == M) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
