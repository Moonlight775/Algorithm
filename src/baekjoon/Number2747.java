package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];   // 0번째 부터 시작하지만 출력은 해당 숫자의 index가 출력되어야 하므로 배열의 크기는 n+1로 해준다.
        arr[0] = 0;
        arr[1] = 1;

        for (int i=2; i<n+1; i++) {
            arr[i] = arr[i-1] + arr[i-2];   // 피보나치 수를 구하기 위한 식 Fn = Fn-1 + Fn-2 (n ≥ 2)을 따라준다.
        }

        System.out.println(arr[n]);     // n번째 피보나치 수 출력
    }
}
