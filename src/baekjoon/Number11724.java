package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number11724 {

    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 정점의 개수
        int m = Integer.parseInt(st.nextToken());   // 간선의 개수
        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        // 인접 리스트 초기화
        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            // 양방향 에지이므로 양쪽에 에지 더하기
            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;

        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {  // 방문하지 않은 노드가 없을 때까지 반복
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    static void DFS(int v) {
        if (visited[v]) return;

        visited[v] = true;

        for (int i : A[v]) {
            if (!visited[i]) {  // 연결 노드 중 방문하지 않았던 노드만 탐색
                DFS(i);
            }
        }
    }
}