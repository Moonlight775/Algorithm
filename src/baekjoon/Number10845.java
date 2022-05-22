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
                    sb.append(que.isEmpty()? -1 : que.poll()).append('\n');
                    break;

                case "size" :
                    sb.append(que.size()).append('\n');
                    break;

                case "empty" :
                    sb.append(que.isEmpty()? 1 : 0).append('\n');
                    break;

                case "front" :
                    sb.append(que.isEmpty()? -1 : que.peek()).append('\n');
                    break;

                case "back" :
                    sb.append(que.isEmpty()? -1 : back).append('\n');
                    break;

            }

        }

        System.out.println(sb);
    }
}
