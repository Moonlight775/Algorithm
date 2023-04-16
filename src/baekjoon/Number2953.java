package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[5];   // 참가자 점수 배열
        int max = 0;    // 최대 점수

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int hap = 0;    // 점수 합
            for (int j = 0; j < 4; j++) {
                hap += Integer.parseInt(st.nextToken());
            }

            score[i] = hap;

            max = Math.max(max, score[i]);
        }

        int index = 0;  // 최대 점수에 해당하는 참가자 번호
        for (int i = 0; i < 5; i++) {
            if (score[i] == max) {
                index = i + 1;
            }
        }

        System.out.println(index + " " + max);
    }
}
