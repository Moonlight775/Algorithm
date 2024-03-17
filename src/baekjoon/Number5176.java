package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number5176 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (K-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int P = Integer.parseInt(st.nextToken());   // 참가자의 수
            int M = Integer.parseInt(st.nextToken());   // 자리의 수
            int[] seat = new int[M + 1];
            int count = 0;  // 앉지 못한 사람의 수

            for (int i = 0; i < P; i++) {
                int num = Integer.parseInt(br.readLine());  // 앉으려는 자리 번호

                if (seat[num] == 0) {   // 자리가 비었다면 앉음
                    seat[num]++;
                }
                else {  // 자리가 차있다면 못 앉음
                    count++;
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}