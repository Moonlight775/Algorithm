package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number16433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // R: 짝수, C: 짝수 or R: 홀수, C: 홀수라면
                if ((R % 2 == 0 && C % 2 == 0) || (R % 2 == 1 && C % 2 == 1)) {
                    // 당근을 심을 수 있는 위치는 (홀,홀) and (짝,짝)
                    if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                        sb.append("v");
                    }
                    else {
                        sb.append(".");
                    }
                }
                else {  // R: 짝수, C: 홀수 or R: 홀수, C: 짝수라면
                    // 당근을 심을 수 있는 위치는 (홀,짝) and (짝,홀)
                    if ((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) {
                        sb.append("v");
                    }
                    else {
                        sb.append(".");
                    }   // if closed
                }   // if closed
            }   // for closed
            sb.append('\n');
        }   // for closed

        System.out.println(sb);
    }
}