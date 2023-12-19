package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number15921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 연습 기록의 개수

        if (N > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 평균/기댓값 = 1이므로 연습기록을 저장할 필요는 없다.
            for (int i = 0; i < N; i++) {
                st.nextToken();
            }
            System.out.println("1.00");
        } else {
            System.out.println("divide by zero");
        }
    }
}