package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number2606 {

    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());    // 컴퓨터의 수
        int m = Integer.parseInt(br.readLine());    // 직접 연결되어 있는 컴퓨터 쌍의 수
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

            A[s].add(e);
            A[e].add(s);
        }

        DFS(1);

        System.out.println(count);
    }

    public static void DFS(int v) {
        if (visited[v]) {
            return;
        }

        visited[v] = true;

        for (int i : A[v]) {
            if (!visited[i]) {  // 연결 노드 중 방문하지 않았던 노드만 탐색
                count++;
                DFS(i);
            }
        }
    }
}