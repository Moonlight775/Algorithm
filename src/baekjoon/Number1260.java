package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number1260 {

    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());       // 노드 개수
        int M = Integer.parseInt(st.nextToken());       // 에지 개수
        int Start = Integer.parseInt(st.nextToken());   // 시작점
        A = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            A[S].add(E);
            A[E].add(S);
        }

        // 정점 번호가 작은 것을 먼저 방문하기 위해 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[N + 1];   // 방문 배열 초기화
        DFS(Start);
        sb.append('\n');

        visited = new boolean[N + 1];   // 방문 배열 초기화
        BFS(Start);
        sb.append('\n');

        System.out.println(sb);
    }

    // DFS 구현
    public static void DFS(int Node) {
        sb.append(Node).append(" ");

        visited[Node] = true;

        for (int i : A[Node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    // BFS 구현
    private static void BFS(int Node) {
        Queue<Integer> que = new LinkedList<>();
        visited[Node] = true;
        que.add(Node);

        while (!que.isEmpty()) {
            int now_Node = que.poll();
            sb.append(now_Node).append(" ");

            for (int i : A[now_Node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    que.add(i);
                }
            }
        }
    }
}