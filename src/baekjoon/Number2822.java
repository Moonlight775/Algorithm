package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] score = new int[8][2];  // 점수와 인덱스를 담을 배열
        int[] result = new int[5];      // 5개의 상위 인덱스
        int sum = 0;

        for (int i=0; i<score.length; i++) {
            score[i][0] = Integer.parseInt(br.readLine());
            score[i][1] = i+1;
        }

        Arrays.sort(score, (int[] a, int[] b) -> b[0] - a[0]);

        for (int i=0; i<result.length; i++) {
            sum += score[i][0];
            result[i] = score[i][1];
        }

        Arrays.sort(result);

        System.out.println(sum);

        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
