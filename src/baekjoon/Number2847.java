package baekjoon;

import java.util.Scanner;

public class Number2847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 레벨의 수
        int[] arr = new int[N]; // 레벨 별 점수를 저장할 배열

        // 배열 초기화
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;

        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] >= arr[i + 1]) {     // 인덱스 i의 값이 앞선 i+1의 값보다 크거나 같다면
                int diff = arr[i] - arr[i+1] + 1;   // i의 값이 i+1의 값보다 1만큼 작아지기 위해 끝에 +1
                answer += diff;     // 점수를 감소시킨 양
                arr[i] -= diff;     // 점수를 감소시킨 arr[i]의 값
            }
        }

        System.out.println(answer);
    }
}