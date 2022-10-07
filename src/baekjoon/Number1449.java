package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1449 {

    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 물이 새는 곳의 개수
        int L = Integer.parseInt(st.nextToken());   // 테이프의 길이

        int[] arr = new int[N];     // 물 새는 위치 배열

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count = 1;  // 무조건 1개는 쓰므로 1부터 시작
        int skip = 0;

        for (int i=0; i<N-1; i=skip) {

            for (int j=i+1; j<N; j++) {
                skip++;

                // 테이프의 길이보다 물 새는 곳 위치의 차가 커지면 새로운 테이프 필요
                if (arr[j] - arr[i] >= L) {
                    count++;
                    break;
                }
            }

        }

        System.out.println(count);
    }
}
