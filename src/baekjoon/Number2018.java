package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 자연수
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while (end_index != N) {
            if (sum == N) {         // 현재 연속 합이 N과 같은 경우
                count++;
                end_index++;
                sum += end_index;
            } else if (sum > N) {   // 현재 연속 합이 N보다 더 큰 경우
                sum -= start_index;
                start_index++;
            } else {                // 현재 연속 합이 N보다 작은 경우
                end_index++;
                sum += end_index;
            }
        }

        System.out.println(count);

        /* int count = 0;  // 연속된 자연수의 합의 개수

        for (int i=1; i<=N/2; i++) {    // N/2 이상의 수 부터는 무조건 연속된 합은 N보다 커지므로 범위를 N/2로 지정
            int sum = i;
            for (int j=i+1; j<=N/2+1; j++) {    // 연속된 자연수의 합이므로 j=i+1, 범위는 i보다 +1
                sum += j;   // 연속된 합

                if (sum > N) break;     // 합이 N보다 커지면 답이 아니므로 break
                else if (sum == N) {
                    count++;    // 연속된 합으로 자연수가 되면 count
                    break;
                }

            }
        }

        System.out.println(count+1);    // 자기 자신의 수까지 포함해야하므로 +1
        */
    }
}
