package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());    // 시험장의 개수
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        long answer = 0;    // 감독관의 수

        for (int i = 0; i < N; i++) {
            // 총감독관은 1명이므로, (응시자 - B) 로 총감독관이 감시할 수 있는 응시자만큼 제외
            int current = arr[i] - B;

            if (current <= 0) { // (응시자 - B)가 음수라면 총감독관 1명이 모든 응시자를 커버 가능
                answer++;       // 총감독관 1명만 추가
                continue;
            }

            // (응시자 - B)의 인원을 C로 나누고 올림하여 부감독관의 인원수 파악
            // +1은 총감독관 1명을 추가해주기 위함
            answer += (long) Math.ceil((double) current / C) + 1;
        }

        System.out.println(answer);
    }
}