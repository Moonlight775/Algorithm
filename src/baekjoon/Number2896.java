package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2896 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] juice = new int[3];   // 주스의 양 배열
        int[] rate = new int[3];    // 주스의 비율 배열
        double min = 500;

        // 주스의 양 초기화
        for (int i = 0; i < 3; i++) {
            juice[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");

        // 주스의 비율 초기화
        for (int i = 0; i < 3; i++) {
            rate[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 3; i++) {
            min = Math.min((double)juice[i] / rate[i], min);
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("%.6f ", Math.abs(juice[i] - (rate[i] * min)));
        }
    }
}
