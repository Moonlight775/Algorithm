package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 단어의 수
        int count = 0;  // 좋은 단어 개수

        for (int i = 0; i < N; i++) {
            Stack<Character> stack = new Stack<>();
            char[] str = br.readLine().toCharArray();

            // 이전 문자와 현재 문자가 같다면 pop()해서 이전 문자 제거
            // 다른 문자라면 스택에 추가
            for (char c : str) {
                if (stack.size() > 0 && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            // 스택이 비었다면 좋은 단어
            if (stack.size() == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}