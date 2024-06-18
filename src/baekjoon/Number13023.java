package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number13023 {

    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static boolean arrive;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 노드 개수
        int M = Integer.parseInt(st.nextToken());   // 에지 개수
        arrive = false;
        A = new ArrayList[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            A[S].add(E);
            A[E].add(S);
        }

        for (int i = 0; i < N; i++) {
            DFS(i, 1);      // depth 1부터 시작

            if (arrive) break;
        }

        if (arrive) {
            System.out.println(1);
        }
        else {
            System.out.println(0);  // 5의 깊이가 없다면 0 출력
        }
    }

    // DFS 구현
    public static void DFS(int now, int depth) {
        if (depth == 5 || arrive) {     // depth 가 5가 되면 종료
            arrive = true;
            return;
        }

        visited[now] = true;

        for (int i : A[now]) {
            if (!visited[i]) {
                DFS(i, depth + 1);  // 재귀 호출이 될때마다 depth 를 1씩 증가
            }
        }

        visited[now] = false;
    }
}