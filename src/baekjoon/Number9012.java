package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            sb.append(solve1(br.readLine())).append('\n');
        }
        System.out.println(sb);

//        solve -> Stack클래스를 활용하여 풀 때
//        for (int i=0; i<T; i++) {
//            sb.append(solve(br.readLine())).append('\n');
//        }
//
//        System.out.println(sb);
        }

        public static String solve(String s) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(') {
                    stack.push(c);
                } else if (stack.empty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }

            if (stack.empty()) {
                return "YES";
            } else {
                return "NO";
            }
        }


        public static String solve1(String str) {
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                count++;
            } else if (count == 0) {
                return "NO";
            } else {
                count--;
            }
        }

        if (count == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
