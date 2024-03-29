package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int index  = 1;     // 출력 시 케이스의 넘버링

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int L = Integer.parseInt(st.nextToken());   // 사용가능한 일 수
            int P = Integer.parseInt(st.nextToken());   // 연속하는 일 수
            int V = Integer.parseInt(st.nextToken());   // 휴가 일 수
            int result;     // 캠핑장을 최대 이용가능한 일 수
            int multi;     // L의 몇 배수만큼 지낼 수 있는지를 담기 위한 배수 변수
            int rest;     // 배수를 구한 후 나머지 일 수

            if (L == 0) break;

            multi = V / P;      // V를 P로 나눈 후의 몫은, 사용가능한 일(L)의 배수가 된다.
            rest  = V % P;

            result = L * multi;     // 사용가능한 일 수 x 배수의 값은 무조건 사용할 수 있다.

            // 나머지 일보다 L이 작다면 L만큼
            // L보다 나머지 일이 작다면 나머지 일만큼 캠핑 가능
            result += Math.min(rest, L);

            sb.append("Case ").append(index).append(": ").append(result).append('\n');

            index++;
        }

        System.out.println(sb);
    }
}
