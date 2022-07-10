package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5]; // 주어지는 다섯 개의 자연수를 담을 배열

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());  // 배열 초기화
        }

        int num = 1;    // 적어도 세 개로 나누어 지는 가장 자연수를 담을 변수
        int count = 0;  // 나누어지는 횟수

        while (true) {
            for (int i=0; i<arr.length; i++) {
                if (num % arr[i] == 0) {    // 다섯 개의 자연수 중 나누어진다면
                    count++;                // count 증가
                }

                if (count >= 3) {           // 나누어지는 수가 3개 이상 있을 경우
                    System.out.println(num);
                    return;
                }
            }
            count = 0;
            num++;
        }
    }
}
