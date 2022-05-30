package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];
        int sum = 0;
        int min = 100;      // 주어지는 자연수는 100보다 작으므로 최대값으로 설정

        for (int i=0; i<7; i++) {
            arr[i] = Integer.parseInt(br.readLine());   // 7개의 자연수 배열 초기화
        }

        for (int i=0; i<7; i++) {
            if (arr[i] % 2 == 1) {      // 주어지는 값이 홀수라면
                sum += arr[i];          // 모두 합해준다.

                if (arr[i] < min) {     // 홀수라는 가정하에 min보다 작으면
                    min = arr[i];       // 최소값 변경
                }
            }
        }

        if (sum == 0) {                 // 합이 0이라는 뜻은 홀수가 없다는 것
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
