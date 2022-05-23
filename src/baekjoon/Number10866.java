package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Number10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                case "push_front" :
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case "push_back" :
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front" :
                    sb.append(dq.isEmpty()? -1 : dq.pollFirst()).append('\n');
                    break;

                case "pop_back" :
                    sb.append(dq.isEmpty()? -1 : dq.pollLast()).append('\n');
                    break;

                case "size" :
                    sb.append(dq.size()).append('\n');
                    break;

                case "empty" :
                    sb.append(dq.isEmpty()? 1 : 0).append('\n');
                    break;

                case "front" :
                    sb.append(dq.isEmpty()? -1 : dq.peekFirst()).append('\n');
                    break;

                case "back" :
                    sb.append(dq.isEmpty()? -1 : dq.peekLast()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
