package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Number1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());   // 사람 수
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> que = new LinkedList<>();

        // 큐 초기화
        for (int i=1; i<=N; i++) {
            que.offer(i);
        }

        sb.append("<");

        // 출력 방식을 위해 큐에 1개 남기 전까지 반복
        while (que.size() != 1) {
            // K번째 전까지 큐 맨 뒤에 데이터 추가
            for (int i=0; i<K-1; i++) {
                que.offer(que.poll());
            }
            // K번째는 제거하며 출력
            sb.append(que.poll()).append(", ");
        }
        // 마지막 값은 따로 출력 (출력 형식때문)
        sb.append(que.poll()).append(">");

        System.out.println(sb);
    }
}
