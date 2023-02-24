package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 참여하는 사람 수

        int Max = 0;    // 가장 많은 상금

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int first = Integer.parseInt(st.nextToken());   // 첫 번째 주사위
            int second = Integer.parseInt(st.nextToken());  // 두 번째 주사위
            int third = Integer.parseInt(st.nextToken());   // 세 번째 주사위
            int prize;  // 상금

            if (first == second && second == third) {   // 1번 조건
                prize = 10000 + (first * 1000);
            } else if (first == second || second == third) {    // 2번 조건
                prize = 1000 + (second * 100);
            } else if (first == third) {    // 2번 조건
                prize = 1000 + (first * 100);
            } else {    // 3번 조건
                int max = Math.max(first, second);
                max = Math.max(max, third);
                prize = max * 100;
            }

            Max = Math.max(Max, prize); // 가장 많은 상금을 구하기 위한 비교
        }

        System.out.println(Max);
    }
}
