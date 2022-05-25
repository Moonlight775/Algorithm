package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<3; i++) {
            int result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j=0; j<4; j++) {
                result += Integer.parseInt(st.nextToken());
            }

            if (result == 3) {
                sb.append("A").append('\n');
            }
            else if (result == 2) {
                sb.append("B").append('\n');
            }
            else if (result == 1) {
                sb.append("C").append('\n');
            }
            else if (result == 0) {
                sb.append("D").append('\n');
            }
            else {
                sb.append("E").append('\n');
            }
        }
        System.out.println(sb);
    }
}
