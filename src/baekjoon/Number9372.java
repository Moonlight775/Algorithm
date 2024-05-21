package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number9372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 수

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());   // 국가의 수
            int M = Integer.parseInt(st.nextToken());   // 비행기의 종류

            for (int i = 0; i < M; i++) {
                br.readLine();  // 저장할 필요 없는 정보
            }

            // 최소 신장 트리의 성질을 이용
            // 간선의 개수 = 정점의 개수 - 1
            // 즉, N개의 국가에 연결된 최소의 비행기 종류 개수는 N - 1
            System.out.println(N - 1);
        }
    }
}