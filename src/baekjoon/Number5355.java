package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number5355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            double num = Double.parseDouble(st.nextToken());    // 주어지는 수

            while (st.hasMoreTokens()) {    // 연산자 수는 랜덤이므로 토큰이 빌때까지
                switch (st.nextToken()) {
                    case "@":           // @는 3을 곱하고
                        num *= 3;
                        break;
                    case "%":           // %는 5를 더하며
                        num += 5;
                        break;
                    case "#":           // #는 7을 뺀다
                        num -= 7;
                        break;
                }
            }

            System.out.printf("%.2f" , num);    // 소수점 둘째 자리까지 출력
            System.out.println();
        }
    }
}
