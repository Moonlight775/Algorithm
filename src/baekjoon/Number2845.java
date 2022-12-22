package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());   // 1m^2당 사람의 수
        int P = Integer.parseInt(st.nextToken());   // 파티장 넓이
        int num = L * P;    // 파티장에 있던 사람의 수

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());   // 기사에 실려있는 참가자의 수
            sb.append(n - num).append(" ");   // 기사와 실제 사람 수의 차이
        }

        System.out.print(sb);
    }
}
