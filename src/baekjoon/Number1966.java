package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Number1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());    // 테스트케이스의 수

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());   // 문서의 개수
            int M = Integer.parseInt(st.nextToken());   // Queue에서 몇 번째 놓여있는지

            LinkedList<int[]> que = new LinkedList<>(); // Queue 선언
            st = new StringTokenizer(br.readLine(), " ");

            for (int i=0; i<N; i++) {
                que.offer(new int[] {i, Integer.parseInt(st.nextToken()) });    // {초기 위치(인덱스), 중요도}
            }

            int cnt = 0;    // 출력 횟수

            while (!que.isEmpty()) {    // 큐가 비어 있지 않다면 반복, 케이스 마다 반복
                int[] first = que.poll();   // 첫 번째 원소
                boolean isMax = true;       // first가 가장 큰 원소인지 판단

                for (int i=0; i<que.size(); i++) {      // 큐에 남아있는 원소들과 중요도 비교

                    if (first[1] < que.get(i)[1]) {     // 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우
                        que.offer(first);               // 뽑은 원소 및 i 이전 원소들을 뒤로 보낸다.
                        for (int j=0; j<i; j++) {
                            que.offer(que.poll());
                        }

                        isMax = false;      // first원소가 가장 큰 원소가 아니였으므로 false로 초기화
                        break;
                    }
                }

                if (isMax == false) {       // first 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로
                    continue;
                }

                // first 원소가 가장 큰 원소였으므로 해당 원소는 출력해야하는 문서
                cnt++;
                if (first[0] == M) {        // 찾고자 하는 문서라면 해당 테스트케이스 종료
                    break;
                }
            }

            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }
}
