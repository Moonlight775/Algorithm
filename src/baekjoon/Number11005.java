package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 10진법 수
        int B = Integer.parseInt(st.nextToken());   // B진법

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            // 나머지가 10 이상이라면 A~Z로 표현
            // 아스키 코드에서 A가 65부터 시작이므로 +55
            if (N % B >= 10) {
                sb.append((char) ((N % B) + 55));
            }
            else {
                sb.append((N % B));
            }

            N /= B;
        }

        System.out.println(sb.reverse());
    }
}