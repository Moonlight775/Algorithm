package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Number11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i=1; i<=N; i++) {              // 1부터 시작
            que.offer(i);                       // list 초기화 (1~N까지 입력)
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");                         // 출력의 시작이 '<'로 시작하기 때문에

        while (que.size() > 1) {                // 맨 마지막 수에는 ','가 들어가면 안 되므로 예외 처리하기 위해서

            for (int i=0; i<K-1; i++) {
                que.offer(que.poll());          // K번째 전까지 수를 뽑아서 맨 뒤에 붙여준다.
            }

            sb.append(que.poll()).append(", "); // 출력 형식을 맞추기 위해서 ', '를 붙여준다.
        }

        sb.append(que.poll()).append(">");      // 맨 마지막 수 뒤에는 ','가 아닌 '>'를 붙여준다.
        System.out.println(sb);
    }
}
