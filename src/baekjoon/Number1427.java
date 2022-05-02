package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Number1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 정렬하려는 수
        int len = String.valueOf(N).length();       // 수의 길이

        Integer[] arr = new Integer[len];   // 정렬할 배열

        for (int i=0; i<len; i++) {
            arr[i] = N % 10;    // 입력받은 N과는 다른 순서로 초기화 되지만 후에 내림차순 할 것이기 때문에 상관없다.
            N /= 10;
        }

        Arrays.sort(arr, Collections.reverseOrder());   // 내림차순하기 위한 sort()

        for (int i : arr) {
            System.out.print(i);    // 내림차순 후 출력
        }
    }
}
