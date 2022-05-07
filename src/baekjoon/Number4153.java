package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;  // 0 0 0이 입력되면 while문 종료

            // 피타고라스의 정리에 맞게 조건 정리
            if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
                sb.append("right").append('\n');
            }
            else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)){
                sb.append("right").append('\n');
            }
            else if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
                sb.append("right").append('\n');
            }
            else {
                sb.append("wrong").append('\n');
            }
        }
        System.out.println(sb);
    }
}
