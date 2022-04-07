package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int C = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        StringTokenizer st;

        for (int i=0; i<C; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());   // 테스트 케이스마다 학생의 수
            int[] arr = new int[N];
            int sum = 0;
            int cnt = 0;

            for (int j=0; j<N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            for (int k=0; k<N; k++) {
                if (arr[k] > (double)sum/N) {   // 해당 점수가 평균을 넘는다면
                    cnt++;
                }
            }

            sb.append(String.format("%.3f", (double)cnt/N*100)).append("%").append('\n');

        }

        System.out.println(sb);
    }
}
