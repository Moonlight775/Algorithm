package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 막대기의 개수
        int[] stick = new int[N];   // 막대기 높이 배열

        // 배열 초기화
        for (int i = 0; i < N; i++) {
            stick[i] = Integer.parseInt(br.readLine());
        }

        int count = 1;  // 오른쪽에서 봤을 때 보이는 막대기의 개수 , 맨 오른쪽 막대기는 무조건 보이므로 1로 시작
        int temp = stick[N - 1];

        // 오른쪽에서 볼 때 보이는 막대기의 개수 찾기
        for (int i = N - 2; i >= 0; i--) {
            if (stick[i] > temp) {
                count++;
                temp = stick[i];
            }
        }

        System.out.println(count);
    }
}