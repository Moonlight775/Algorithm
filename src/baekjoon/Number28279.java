package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Number28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deq = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());    // 명령의 수

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());

            switch (Integer.parseInt(st.nextToken())) {
                case 1 :
                    deq.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case 2 :
                    deq.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case 3 :
                    if (deq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(deq.removeFirst()).append('\n');
                    }
                    break;

                case 4 :
                    if (deq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(deq.removeLast()).append('\n');
                    }
                    break;

                case 5 :
                    sb.append(deq.size()).append('\n');
                    break;

                case 6 :
                    if (deq.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;

                case 7 :
                    if (deq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(deq.getFirst()).append('\n');
                    }
                    break;

                case 8 :
                    if (deq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(deq.getLast()).append('\n');
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}