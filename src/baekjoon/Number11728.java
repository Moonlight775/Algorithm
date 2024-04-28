package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 배열 A의 크기
        int M = Integer.parseInt(st.nextToken());   // 배열 B의 크기
        int[] A = new int[N];
        int[] B = new int[M];
        int[] result = new int[N + M];

        // A배열 초기화 & result 배열에 A배열 초기화
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            result[i] = A[i];
        }

        // B배열 초기화 & result 배열에 A배열 값 이후에 B배열 넣기
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
            result[i + N] = B[i];
        }

        Arrays.sort(result);    // 오름차순 정렬

        StringBuilder sb = new StringBuilder();
        for (int a : result) {
            sb.append(a).append(" ");
        }

        System.out.println(sb);
    }
}