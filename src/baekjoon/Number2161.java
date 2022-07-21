package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Number2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue<Integer> que = new LinkedList<>();

        for (int i=1; i<=N; i++) {
            que.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        while (!que.isEmpty()) {
            sb.append(que.poll()).append(" ");  // 맨 위 카드 버리기

            if (que.isEmpty()) break;   // 큐가 비면 탈출

            que.offer(que.poll());  // 그 다음 맨 위 카드 맨 밑으로 옮기기
        }

        System.out.println(sb);
    }
}
