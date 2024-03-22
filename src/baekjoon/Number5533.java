package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number5533 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 참가자의 수
        int[][] arr = new int[N][3];
        int[] score = new int[N];   // 각 참가자의 총 점수 배열

        // 플레이어들의 점수 2차원 배열 초기화
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < N; j++) {
                // 같은 점수가 있을 경우 true로 변경
                // arr[j][i]를 기준으로 마지막 사람까지 비교해주기 위해서 필요
                boolean flag = false;

                for (int k = j + 1; k < N; k++) {
                    if (arr[j][i] == arr[k][i]) {
                        arr[k][i] = 0;
                        flag = true;
                    }
                }

                // 같은 점수가 있었다면 arr[j][i]도 0점으로 변경해주어야 한다.
                if (flag) {
                    arr[j][i] = 0;
                }

                score[j] += arr[j][i];
            }
        }

        for (int a : score) {
            System.out.println(a);
        }
    }
}