package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 학생 수
        int K = Integer.parseInt(st.nextToken());   // 방 배정 최대 인원 수
        int[][] student = new int[7][2];    // student[학년][성별]

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());   // 성별 (0=여학생, 1=남학생)
            int Y = Integer.parseInt(st.nextToken());   // 학년

            student[Y][S]++;    // 가로 행 index 가 학년, 세로 열 index 가 성별로 인원 수 합산
        }

        int count = 0;  // 최소한의 방의 수

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j <= 1; j++) {
                if (student[i][j] % K != 0) {   // 방 배정이 나누어 떨어지지 않으면 방 1개 추가
                    count++;
                }

                count += student[i][j] / K; // 해당 학년, 성별에 필요한 방의 수
            }
        }

        System.out.println(count);
    }
}