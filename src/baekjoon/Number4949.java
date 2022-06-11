package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;

        while (true) {
            str = br.readLine();

            if (str.equals(".")){   // 종료 조건
                break;
            }

            sb.append(balance(str)).append('\n');
        }

        System.out.println(sb);
    }

    public static String balance (String str) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);         // i번 문자

            if (c == '(' || c == '[') {     // 여는 괄호 '(', '['의 경우 push
                stack.push(c);
            }

            else if (c == ')') {            // 닫는 소괄호일 경우
                if (stack.empty() || stack.peek() != '(') {     // 스택이 비었거나 pop할 원소가 소괄호랑 매치가 안 될 경우
                    return "no";
                }
                else {
                    stack.pop();
                }
            }

            else if (c == ']') {            // 닫는 대괄호일 경우
                if (stack.empty() || stack.peek() != '[') {     // 스택이 비었거나 pop할 원소가 대괄호랑 매치가 안 될 경우
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
        }

        if (stack.empty()) {
            return "yes";
        }
        else {
            return "no";
        }
    }
}
