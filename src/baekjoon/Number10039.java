package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[5];   // 학생들 점수 배열
        int sum = 0;    // 점수 총 합

        for (int i = 0; i < score.length; i++) {
            int num = Integer.parseInt(br.readLine());  // 점수

            score[i] = Math.max(num, 40);   // 40점 미만이면 40점으로 변경
            sum += score[i];
        }

        System.out.println(sum / 5);    // 5명의 학생 점수 평균
    }
}