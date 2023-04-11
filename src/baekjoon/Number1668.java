package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1668 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 트로피 개수
        int[] trophy = new int[N];  // 트로피 배열
        int left_count = 1;     // 왼쪽에서 봤을 때 보이는 개수
        int right_count = 1;    // 오른쪽에서 봤을 때 보이는 개수

        // 트로피 배열 초기화
        for (int i = 0; i < N; i++) {
            trophy[i] = Integer.parseInt(br.readLine());
        }

        int left_max = trophy[0];   // 가장 높은 트로피
        for (int i = 1; i < N; i++) {
            // 왼쪽 기준 다음 트로피가 더 높다면 카운트와 가장 높은 트로피를 초기화
            if (left_max < trophy[i]) {
                left_count++;
                left_max = trophy[i];
            }
        }

        int right_max = trophy[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            // 오른쪽 기준 다음 트로피가 더 높다면 카운트와 가장 높은 트로피를 초기화
            if (right_max < trophy[i]) {
                right_count++;
                right_max = trophy[i];
            }
        }

        System.out.println(left_count);
        System.out.println(right_count);
    }
}
