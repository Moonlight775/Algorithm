package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Number1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());

        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();

        // 스택 초기화
        for (int i=0; i<str.length(); i++) {
            leftStack.push(String.valueOf(str.charAt(i)));
        }

        for (int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                // 왼쪽으로 커서가 움직이듯 오른쪽 끝의 값을 rightStack에 push()
                case "L" :
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;

                // 오른쪽으로 커서가 움직이듯 rightStack의 값을 leftStack에 push()
                case "D" :
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;

                // 커서 왼쪽에 값을 제거하는 것이므로 leftStack에 값을 pop()
                case "B" :
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;

                // 커서 왼쪽에 값을 추가하는 것이므로 leftStack에 값을 push()
                case "P" :
                    String S = st.nextToken();

                    leftStack.push(S);
                    break;
            }
        }

        // leftStack 값들을 rightStack에 추가
        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        // rightStack 값들을 출력
        StringBuilder sb = new StringBuilder();
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        System.out.println(sb);
    }
}
