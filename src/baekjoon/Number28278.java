package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Number28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());    // 명령의 수

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(st.nextToken())) {
                case 1 :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;

                case 2 :
                    if (stack.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(stack.pop()).append('\n');
                    }
                    break;

                case 3 :
                    sb.append(stack.size()).append('\n');
                    break;

                case 4 :
                    if (stack.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;

                case 5 :
                    if (stack.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(stack.peek()).append('\n');
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}