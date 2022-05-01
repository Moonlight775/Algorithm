package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Number2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        // 1개 삭제 뒤 1개가 추가 되므로, 2*N-1의 공간이 필요
        // index는 1부터 시작할 것으로 2*N의 공간이면 된다.
        
        int[] que = new int[2*N];
        
        for (int i=1; i<=N; i++) {
            que[i] = i;     // 1부터 N까지의 수를 int[] 배열에 초기화
        }
        
        int prev_index = 1; // 처음 수
        int last_index = N; // 마지막 수
        
        while (N-- > 1) {   // 1장 남을 때까지
            prev_index++;   // 맨 윗장은 버리는 개념 (1씩 증가하며 지나가므로)
            que[last_index + 1] = que[prev_index];  // 맨 뒤에 맨 윗장의 값을 추가
            last_index++;   
            prev_index++;
        }

        System.out.println(que[prev_index]);    // 마지막 남은 카드 출력

        
        // Queue 클래스 사용하는 방법
        /*Queue<Integer> que = new LinkedList<>();    // int형 queue 선언, linkedlist 이용

        int N = Integer.parseInt(br.readLine());

        for (int i=1; i<=N; i++) {
            que.offer(i);   // 1부터 N까지의 수를 queue에 초기화
        }

        while (que.size() > 1) {    // 1장 남기전까지
            que.poll();             // 맨 위 카드 제거
            que.offer(que.poll());  // 다음은 맨 위카드를 제거 후 맨 뒤에 추가
        }

        System.out.println(que.poll()); // 마지막 남은 카드 출력*/
    }
}
