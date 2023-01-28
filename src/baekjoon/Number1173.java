package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 운동하는 시간
        int m = Integer.parseInt(st.nextToken());   // 초기 맥박 & 최소 맥박
        int M = Integer.parseInt(st.nextToken());   // 최대 맥박
        int T = Integer.parseInt(st.nextToken());   // 운동 시 증가 맥박
        int R = Integer.parseInt(st.nextToken());   // 휴식 시 감소 맥박

        if (m+T > M) {
            System.out.println(-1);
            return;
        }

        int pulse = m;
        int count = 0;
        int answer = 0;

        while (count < N) {
            if (pulse+T <= M) {
                pulse = pulse+T;
                count++;
                answer++;
                continue;
            }
            if (pulse-R < m) {
                pulse = m;
                answer++;
            }
            else if (pulse+T > M) {
                pulse = pulse-R;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
