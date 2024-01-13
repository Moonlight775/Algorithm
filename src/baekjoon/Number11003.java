package baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Number11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 숫자의 개수
        int L = Integer.parseInt(st.nextToken());   // 슬라이딩 윈도우의 크기

        st = new StringTokenizer(br.readLine());
        Deque<Node> deq = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());     // 현재 수

            // 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도 감소
            while (!deq.isEmpty() && deq.getLast().value > now) {
                deq.removeLast();
            }

            deq.addLast(new Node(now, i));

            // 범위에서 벗어나면 덱에서 제거
            if (deq.getFirst().index <= i - L) {
                deq.removeFirst();
            }

            bw.write(deq.getFirst().value + " ");
        }

        bw.flush();
        bw.close();
    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}