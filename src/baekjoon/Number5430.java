package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Number5430 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        ArrayDeque<Integer> deq;
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (T-- > 0) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());    // 배열의 크기

            st = new StringTokenizer(br.readLine(), "[,]");

            deq = new ArrayDeque<>();

            // 덱 초기화
            for (int i=0; i<n; i++) {
                deq.offer(Integer.parseInt(st.nextToken()));
            }

            func(p,deq);

        }

        System.out.println(sb);
    }

    public static void func(String p, ArrayDeque<Integer> deq) {
        boolean isReverse = false;  // flase면 정방향, true면 역방향(뒤집힌 경우)

        // 함수 구현
        for (int i=0; i<p.length(); i++) {
            char c = p.charAt(i);

            // R 함수인 경우 isReverse를 역전시켜서 정방향으로 갈지 역방향으로 갈지 결정
            if (c == 'R') {
                isReverse = !isReverse;
                continue;
            }

            // D는 버리기로, 정방향 (isReverse = false)이라면 앞에서부터 제거, 역방향 (isReverse = true)이면 뒤에서부터 제거
            if (isReverse) {
                if (deq.pollLast() == null) {
                    sb.append("error").append('\n');
                    return;
                }
            }
            else {
                if (deq.pollFirst() == null) {
                    sb.append("error").append('\n');
                    return;
                }
            }

        }

        makeString(deq, isReverse);
    }

    public static void makeString (ArrayDeque<Integer> deq, boolean isReverse) {
        sb.append("[");

        while (deq.size() >0) {
            // 역방향(뒤집힌 상태)으로 뒤에서 부터 출력
            // 맨 뒤 값을 제거하며 앞에 추가
            if (isReverse) {
                sb.append(deq.pollLast());

                while (!deq.isEmpty()) {
                    sb.append(",").append(deq.pollLast());
                }
            }
            // 정방향으로 앞에서 부터 출력
            // 맨 앞의 값을 제거하여 맨 뒤에 추가
            else {
                sb.append(deq.pollFirst());

                while (!deq.isEmpty()) {
                    sb.append(",").append(deq.pollFirst());
                }
            }
        }

        sb.append("]").append('\n');
    }
}
