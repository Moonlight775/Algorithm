package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sb.append(" ".repeat(i));
            sb.append("*".repeat((2*(N-i))-1)).append('\n');
        }

        for (int i=N-2; i>=0; i--) {
            sb.append(" ".repeat(i));
            sb.append("*".repeat((2*(N-i))-1)).append('\n');
        }

        System.out.println(sb);
    }
}
