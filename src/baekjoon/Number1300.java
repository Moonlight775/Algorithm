package baekjoon;

import java.util.Scanner;

public class Number1300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       // 배열의 크기
        long K = sc.nextLong();     // 구하고자 하는 index
        long start = 1;             // 시작 인덱스
        long end = K;               // 종료 인덱스
        long answer = 0;            // B[K]

        // 이진 탐색 수행
        while (start <= end) {
            long middle = ((start + end) / 2);  // 중간 인덱스
            long count = 0;  // 중앙값보다 작은 수

            // 중앙값보다 작은 수는 몇 개인지 계산
            for (int i = 1; i <= N; i++) {
                count += Math.min(middle / i, N);
            }

            if (count < K) {    // 중앙값 크기보다 작은 수가 K보다 작으면
                start = middle + 1;
            }
            else {  // 중앙값 크기보다 작은 수가 K보다 크거나 같으면
                answer = middle;    // 현재 단계의 중앙값을 정답 변수에 저장
                end = middle - 1;
            }
        }

        System.out.println(answer);
    }
}