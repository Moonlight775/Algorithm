package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2456 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 반의 학생들의 수
        int[] score = new int[3];   // 후보별 점수 합산 배열
        int[] three = new int[3];   // 3점 개수 확인용 배열
        int[] two = new int[3];     // 2점 개수 확인용 배열
        int max = 0;    // 최대 점수값

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 배열 초기화
            for (int i = 0; i < 3; i++) {
                int num = Integer.parseInt(st.nextToken());
                score[i] += num;
                max = Math.max(max, score[i]);

                if (num == 3) {
                    three[i]++;
                } else if (num == 2) {
                    two[i]++;
                }
            }
        }

        int index = 0;

        // 세 점수가 다 다르다면 가장 높은 점수에 해당하는 인덱스 찾기
        if (score[0] != score[1] && score[0] != score[2] && score[1] != score[2]) {
            for (int i = 0; i < 3; i++) {
                if (max == score[i]) {
                    index = i + 1;
                }
            }
        }
        // 같은 점수가 있을 경우 3점, 2점 개수 비교
        else {
            for (int i = 0; i < 2; i++) {
                for (int j = i + 1; j < 3; j++) {
                    if (score[i] == score[j]) {
                        if (three[i] > three[j]) {
                            index = i+1;
                        } else if (three[i] < three[j]) {
                            index = j+1;
                        } else {
                            if (two[i] > two[j]) {
                                index = i+1;
                            } else if (two[i] < two[j]) {
                                index = j+1;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(index + " " + max);
    }
}