package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2846 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 수열의 크기
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());  // 수열을 담을 배열 초기화
        }

        int temp = 0;   // 여러 개의 오르막길이 있을 수 있으므로 temp에 오르막길 마다 담아주고 비워준다.
        int max = 0;    // 가장 큰 오르막길을 담을 변수

        for (int i=1; i<N; i++) {
            if (arr[i] > arr[i-1]) {        // 다음 index가 큰 경우는 오르막길이라는 의미이므로
                temp += arr[i] - arr[i-1];  // 오르막길이 끝날 때까지 차 들을 합해준다. (총합이 오르막길의 크기)
            }
            else {
                temp = 0;
            }
            max = Math.max(max, temp);      // 오르막길이 여러 개일 경우 가장 큰 크기를 찾아준다.
        }

        System.out.println(max);
    }
}
