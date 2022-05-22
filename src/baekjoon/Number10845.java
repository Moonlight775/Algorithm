package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Number10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        int back = -1;

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {

                case "push" :
                    back = Integer.parseInt(st.nextToken());
                    que.offer(back);
                    break;

                case "pop" :
                    if (!que.isEmpty()) {
                        sb.append(que.poll()).append('\n');
                        break;
                    }
                    else {
                        sb.append(-1).append('\n');
                        break;
                    }

                case "size" :
                    sb.append(que.size()).append('\n');
                    break;

                case "empty" :
                    if (!que.isEmpty()) {
                        sb.append(0).append('\n');
                        break;
                    }
                    else {
                        sb.append(1).append('\n');
                        break;
                    }

                case "front" :
                    if (!que.isEmpty()) {
                        sb.append(que.peek()).append('\n');
                        break;
                    }
                    else {
                        sb.append(-1).append('\n');
                        break;
                    }

                case "back" :
                    if (!que.isEmpty()) {
                        sb.append(back).append('\n');
                        break;
                    }
                    else {
                        sb.append(-1).append('\n');
                        break;
                    }

            }

        }

        System.out.println(sb);
    }
}
