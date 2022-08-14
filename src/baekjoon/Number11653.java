package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        // 두 개 이상 곱셈(인수)으로 나타낼 수 있을 때 인수 중 한 개 이상은 √N보다 작거나 같다.
        // for문의 조건 범위를 줄일 수 있다.
        for (int i=2; i<=Math.sqrt(N); i++) {
            while (N%i == 0) {  // 나눠 떨어지면
                sb.append(i).append('\n');
                N /= i;
            }
        }

        if (N != 1) {       // √N보다 큰 소수가 남는다면 출력이 안 되므로 마지막에 1로 나눠 떨어지지 않는다면 그 값은 소수이므로 출력한다.
            sb.append(N);
        }

        System.out.println(sb);
    }
}
