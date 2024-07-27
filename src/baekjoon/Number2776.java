package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Number2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트케이스의 수

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            HashSet<Integer> set = new HashSet<>();

            int N = Integer.parseInt(br.readLine());    // 수첩 1에 적어 놓은 정수의 개수

            // 수첩 1 정수를 HashSet 에 초기화
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                set.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());    // 수첩 2에 적어 놓은 정수의 개수

            // 수첩2에 적혀있는 숫자가 수첩 1에 있는지 확인
            // list 가 아닌 set 의 contains() 를 쓰는 이유는 속도 차이때문
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                boolean flag = set.contains(Integer.parseInt(st.nextToken()));
                sb.append(flag ? 1 : 0).append("\n");
            }
        }

        System.out.println(sb);
    }
}