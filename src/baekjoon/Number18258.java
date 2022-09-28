package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Number18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> que = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());    // 명령의 수

        StringBuilder sb = new StringBuilder();
        while (N-- >0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push" :
                    que.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    if (que.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(que.poll()).append("\n");
                    }
                    break;

                case "size" :
                    sb.append(que.size()).append('\n');
                    break;

                case "empty" :
                    if (que.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;

                case "front" :
                    if (que.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(que.peek()).append('\n');
                    }
                    break;

                case "back" :
                    if (que.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(que.peekLast()).append('\n');
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}
