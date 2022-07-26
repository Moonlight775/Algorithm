package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] count = new int[10001];   // 주어지는 수는 10000보다 작거나 같은 자연수이므로 수의 범위에 맞는 배열 생성

        for (int i=0; i<N; i++) {
            count[Integer.parseInt(br.readLine())]++;   // 입력받은 수에 해당하는 index의 값에 +1해준다.
        }

        StringBuilder sb = new StringBuilder();

        for (int i=1; i<count.length; i++) {
            while (count[i] > 0) {              // count[i] 값이 0이 될 때 까지
                sb.append(i).append('\n');      // index i의 i가 출력해야 하는 값
                count[i]--;                     // 한 번 출력했다면 -1을 해줘서 값이 0이 될 때가지 반복 되도록 한다.
            }
        }
        System.out.println(sb);
    }
}
