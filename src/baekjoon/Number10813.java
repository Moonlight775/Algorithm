package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 바구니 수
        int M = Integer.parseInt(st.nextToken());   // 공을 바꾸는 횟수
        int[] arr = new int[N]; // 바구니 배열

        // 배열 초기화
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        // a번 바구니와 b번 바구니에 들어 있는 공을 교환
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());

            // 배열은 0부터 시작이므로 -1해줌
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}