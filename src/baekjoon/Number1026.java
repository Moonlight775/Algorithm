package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];
        int[] reverseB = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());    // 입력된 정수로 A배열 초기화
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            B[i] = Integer.parseInt(st.nextToken());    // 입력된 정수로 B배열 초기화
        }

        Arrays.sort(A);     // 오름차순 정렬
        Arrays.sort(B);

        for (int i=0; i<B.length; i++) {
            reverseB[i] = B[B.length-i-1];  // B배열 reverse 해준 값을 reverseB 배열에 담는다.
        }

        int sum = 0;
        for (int i=0; i<N; i++) {
            sum += A[i] * reverseB[i];  // A배열 최솟값과 B 배열의 최댓값을 곱하는 식으로 진행하면 함수 S의 최솟값을 구할 수 있다.
        }
        System.out.println(sum);
    }
}
