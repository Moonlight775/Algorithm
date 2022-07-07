package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스 개수

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            while (st.hasMoreTokens()) {    // 문자열이 끝날때까지 (토큰이 없어질 때까지)
                StringBuilder reverse = new StringBuilder(st.nextToken());

                String revrsedStr = reverse.reverse().toString();   // StringBuilder 클래스의 reverse() 메소드를 사용하여 반전

                sb.append(revrsedStr).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
