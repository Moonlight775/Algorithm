package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number14697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());   // 전체 학생 수
        boolean flag = false;

        for (int i = 0; i <= N / A; i++) {
            for (int j = 0; j <= N / B; j++) {
                for (int k = 0; k <= N / C; k++) {
                    if ((A * i) + (B * j) + (C * k) == N) {
                        flag = true;
                        break;
                    }
                }
            }
        }

        if (flag) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}