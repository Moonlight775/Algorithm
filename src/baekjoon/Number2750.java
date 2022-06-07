package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[2001];  // 절대값이 1000보다 작거나 같은 정수이므로 범위 : -1000 ~ 1000

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000] = true;     // 입력 값이 -1000이라고 한다면 0번째 index가 true로 변환
        }

        // 정렬 과정이 따로 필요 없음
        for (int i=0; i<arr.length; i++) {
            if (arr[i]) {   // i가 0부터 순차대로 늘어나므로 정렬된 듯이 출력된다. ex) -1000, -999 라면 index 0, index 1가 true로 순차적으로 출력가능
                sb.append(i-1000).append('\n');
            }
        }

        System.out.println(sb);
    }
}
