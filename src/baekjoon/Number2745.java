package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        double B = Double.parseDouble(st.nextToken());   // B진법
        int sum = 0;    // 10진법 값

        // 제곱근의 자릿수를 위해서 조건설정
        // ex. 8진법 37을 10진법으로 변환하려면 3X8^1 + 7X8^0과 같다.
        // 직관적으로 계산하기 위해 N의 0번째 인덱스부터 계산
        for (int i = N.length() - 1; i >= 0; i--) {
            char C = N.charAt(N.length() - (i + 1));

            if ('0' <= C && C <= '9') {
                sum += (C - '0') * (int)Math.pow(B, i);
            } else if ('A' <= C && C <= 'Z') {
                sum += (C - 'A' + 10) * (int)Math.pow(B, i);
            }
        }

        System.out.println(sum);
    }
}