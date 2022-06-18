package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int d = lcm(A, B);

            sb.append(A*B/d).append('\n');
        }
        System.out.println(sb);
    }

    public static int lcm(int A, int B) {
        while (B != 0) {
            int r = A%B;

            // GCD(a, b) = GCD(b, r)
            A = B;
            B = r;
        }
        return A;
    }
}
