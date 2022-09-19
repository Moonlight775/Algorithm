package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 동전의 종류 개수
        int K = Integer.parseInt(st.nextToken());   // 맞춰야 할 금액

        int[] coin = new int[N];

        // 동전의 가치를 담을 배열 초기화
        for (int i=0; i<N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;  // K원을 만드는데 필요한 동전 개수에 대한 변수

        for (int i=N-1; i>=0; i--) {
            // 동전의 가치가 K보다 작거나 같아야 개수를 셀 수 있다.
            if (coin[i] <= K) {
                // 동전의 가치로 셀 수 있는 개수
                count += K / coin[i];
                K %= coin[i];
            }
        }

        System.out.println(count);
    }
}
