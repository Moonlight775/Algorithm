package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Number5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (T-- > 0) {
            boolean isReverse = false;  // flase면 정방향, true면 역방향(뒤집힌 경우)
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());    // 배열의 크기

            Deque<Integer> deq = new LinkedList<>();

            StringTokenizer st = new StringTokenizer(br.readLine(), "[|,]");

            // 덱 초기화
            for (int i=0; i<n; i++) {
                deq.offer(Integer.parseInt(st.nextToken()));
            }

            // 함수 구현
            for (int i=0; i<p.length(); i++) {
                char c = p.charAt(i);

                // R 함수인 경우 isReverse를 역전시켜서 정방향으로 갈지 역방향으로 갈지 결정
                if (c == 'R') {
                        isReverse = !isReverse;
                    }
                // D는 버리기로, 정방향 (isReverse = false)이라면 앞에서부터 제거, 역방향 (isReverse = true)이면 뒤에서부터 제거
                else if (c == 'D') {
                    if (isReverse) {
                        deq.pollLast();
                    }
                    else {
                        deq.pollFirst();
                    }
                }
            }

            // 덱이 비어있다면 error 출력
            if (deq.isEmpty()) {
                sb.append("error").append('\n');
            }
            // 덱에 값이 있다면
            else {
                sb.append("[");
                for (int i=0; i<deq.size()-1; i++) {
                    // 역방향(뒤집힌 상태)으로 뒤에서 부터 출력
                    // 맨 뒤 값을 제거하며 앞에 추가
                    if (isReverse) {
                        sb.append(deq.peekLast()).append(",");
                        deq.offerFirst(deq.pollLast());
                    }
                    // 정방향으로 앞에서 부터 출력
                    // 맨 앞의 값을 제거하여 맨 뒤에 추가
                    else {
                        sb.append(deq.peekFirst()).append(",");
                        deq.offerLast(deq.pollFirst());
                    }
                }

                if (isReverse) {
                    sb.append(deq.peekLast()).append("]").append('\n');
                }
                else {
                    sb.append(deq.peekFirst()).append("]").append('\n');
                }
            }

        }

        System.out.println(sb);
    }
}
