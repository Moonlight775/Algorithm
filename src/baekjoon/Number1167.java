package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number1167 {

    static boolean[] visited;   // 방문 기록 저장 배열
    static int[] distance;      // 거리 저장 배열
    static ArrayList<Edge>[] A; // 그래프 데이터 저장 인접 리스트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 노드 개수
        A = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        // A 인접 리스트에 그래프 데이터 저장
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int S = Integer.parseInt(st.nextToken());

            while (true) {
                int E = Integer.parseInt(st.nextToken());
                if (E == -1) break;
                int V = Integer.parseInt(st.nextToken());

                A[S].add(new Edge(E, V));
            }
        }

        distance = new int[N + 1];
        visited = new boolean[N + 1];
        BFS(1);

        int max = 1;

        // distance 배열에서 가장 큰 값으로 다시 시작점 설정
        for (int i = 2; i <= N; i++) {
            if (distance[max] < distance[i]) {
                max = i;
            }
        }

        distance = new int[N + 1];
        visited = new boolean[N + 1];
        BFS(max);   // 새로운 시작점으로 실행

        Arrays.sort(distance);
        System.out.println(distance[N]);
    }

    // BFS 구현
    private static void BFS(int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);
        visited[index] = true;

        while (!queue.isEmpty()) {
            int now_node = queue.poll();

            for (Edge i : A[now_node]) {
                int e = i.e;
                int v = i.value;

                if (!visited[e]) {
                    visited[e] = true;
                    queue.add(e);
                    distance[e] = distance[now_node] + v;   // 거리 배열 업데이트
                }
            }
        }
    }
}

class Edge {
    int e;  // 목적지 노드
    int value;  // 에지의 가중치

    public Edge(int e, int value) {
        this.e = e;
        this.value = value;
    }
}