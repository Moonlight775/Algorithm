package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 문제의 개수

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int count = 0;  // 1점일때마다의 점수
        int score = 0;  // 합산 점수

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<N; i++) {
            if (arr[i] == 1) {      // 채점이 1이면
                count += 1;         // 점수 1점씩 누적
                score += count;     // 최종 점수에 누적점수 합산
            }
            else {
                count = 0;          // 최종 점수를 따로 둔 것은 중간에 채점이 0이라면 count는 초기화하여 다시 누적을 시작해주기 위해서다
            }
        }

        System.out.println(score);
    }
}
