package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 온도를 측정한 전체 날짜의 수
        int K = Integer.parseInt(st.nextToken());   // 합을 구하기 위한 연속적인 날짜의 수

        int[] arr = new int[N];
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        // 전체 날짜에 대한 온도 배열 초기화
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<N-K; i++) {         // 조건 범위는 (N-K)까지면 된다, i는 온도 합의 시작점과 같기 때문
            int tmp = 0;

            for (int j=i; j<i+K; j++) {     // i가 시작점 j는 끝을 나타내므로 조건 범위는 (i+K)
                tmp += arr[j];
            }

            if (sum < tmp) {
                sum = tmp;
            }
        }

        System.out.println(sum);
    }
}
