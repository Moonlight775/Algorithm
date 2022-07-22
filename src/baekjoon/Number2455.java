package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int sum = 0;
        int max = 0;

        for (int i=0; i<4; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int out = Integer.parseInt(st.nextToken());     // 내린 사람 수
            int enter = Integer.parseInt(st.nextToken());   // 탄 사람 수

            sum = sum - out + enter;    // 기차 안의 사람 수

            max = Math.max(max, sum);   // max는 가장 많은 사람이 탔을 경우
        }

        System.out.println(max);
    }
}
