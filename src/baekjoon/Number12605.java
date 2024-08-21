package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Number12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 케이스의 개수

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");   // 공백 기준으로 파싱
            Stack<String> stack = new Stack<>();

            while (st.hasMoreTokens()) {    // 토큰이 빌 때까지
                stack.add(st.nextToken());  // 스택에 저장
            }

            sb.append("Case #").append(i).append(": ");

            // 스택에 쌓인 순서대로 출력하면 역순으로 된다.
            while (!stack.isEmpty()) {
                sb.append(stack.pop()).append(" ");
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}