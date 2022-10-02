package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Number1021 {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 큐의 크기
        int M = Integer.parseInt(st.nextToken());   // 뽑아내려 하는 수의 개수

        LinkedList<Integer> deq = new LinkedList<>();

        // list 초기화
        for (int i=1; i<=N; i++) {
            deq.offer(i);
        }

        int count = 0;  // 2번, 3번 연산이 이뤄지는 횟수

        st = new StringTokenizer(br.readLine());
        while (M-- > 0) {
            int num = Integer.parseInt(st.nextToken());     // 입력된 자연수
            int mid = deq.size() / 2;       // 덱의 중간 지점
            int idx = deq.indexOf(num);     // 입력된 자연수의 덱에서 위치

            while (deq.peek() != num) {
                // 입력된 자연수의 위치가 중간 지점보다 왼쪽에 있다면 2번 연산
                if (idx <= mid) {
                    deq.offerLast(deq.pollFirst());
                }
                // 입력된 자연수의 위치가 중간 지점보다 오른쪽에 있다면 3번 연산
                else{
                    deq.offerFirst(deq.pollLast());
                }
                count++;
            }

            if (deq.peek() == num) {
                deq.poll();
            }
        }

        System.out.println(count);
    }
}
