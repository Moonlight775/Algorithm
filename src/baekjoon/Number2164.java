package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Number2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList<>();    // int형 queue 선언, linkedlist 이용

        int N = Integer.parseInt(br.readLine());

        for (int i=1; i<=N; i++) {
            que.offer(i);   // 1부터 N까지의 수를 queue에 초기화
        }

        while (que.size() > 1) {    // 1장 남기전까지
            que.poll();             // 맨 위 카드 제거
            que.offer(que.poll());  // 다음은 맨 위카드를 제거 후 맨 뒤에 추가
        }

        System.out.println(que.poll()); // 마지막 남은 카드 출력
    }
}
