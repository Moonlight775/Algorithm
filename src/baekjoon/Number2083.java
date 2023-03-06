package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            if (name.equals("#")) break;

            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if (age > 17 || weight >= 80) {
                sb.append(name).append(" ").append("Senior");
            }
            else {
                sb.append(name).append(" ").append("Junior");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
