package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1015{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 배열 크기

        int[] A = new int[N];
        int[] sortedA = new int[N];
        int[] B = new int[N];

        // A 배열, sortedA 배열 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            sortedA[i] = A[i];
        }

        // 오름차순으로 A 배열 정렬
        Arrays.sort(sortedA);

        // B 배열에는 정렬된 값으로 초기화
        for (int i=0; i<N; i++) {
            B[i] = sortedA[i];
        }

        // B 배열과 A 배열의 값이 같을때 B 배열의 index값이 수열 값과 같음
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (A[i] == B[j]) {
                    sb.append(j).append(" ");
                    // 출력 후 초기화 해주지 않으면 A 배열에 같은 값이 있을 경우 다음 값이 출력되지 않음으로 초기화
                    B[j] = 0;
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
