package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());   // 호텔의 층 수
            int W = Integer.parseInt(st.nextToken());   // 각 층의 방 수 (사용 안 해도 풀 수 있음)
            int N = Integer.parseInt(st.nextToken());   // N 번째 손님
            int x;  // 엘레베이터로부터 떨어진 거리 (호 수)
            int y;  // 층 수

            if (N%H == 0) {
                y = H;          // 몫이 0이면 0층이 되는데, 호텔 층 수의 꼭대기 층에 해당한다.
                x = N/H;        // N이 H의 배수일 경우는 호 수가 정확히 떨어진다.
            } else {
                y = N%H;        // 몫이 층수가 된다.
                x = (N/H) + 1;  // N이 H의 배수가 아닐 경우는 올림해주어야 호 수가 나온다.
            }

            sb.append(y*100 + x).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
