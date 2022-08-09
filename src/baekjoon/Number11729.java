package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number11729 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 원판의 개수

        sb.append((int)(Math.pow(2, N) - 1)).append('\n');  // 하노이 탑 공식에 따른 옮긴 횟수

        Hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    // N : 원판의 개수
    // start : 출발지
    // mid : 옮기기 위해 이동해야 하는 장소
    // to : 목적지
    public static void Hanoi(int N, int start, int mid, int to) {
        if (N == 1) {   // 이동할 원반의 수가 1개라면
            sb.append(start).append(" ").append(to).append('\n');
            return;
        }

        // A -> c로 옮긴다고 가정할 때
        // 1. N-1개를 A에서 B로 이동 (start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
        Hanoi(N-1, start, to, mid);

        // 2. 1개를 A에서 C로 이동 (start 지점의 N번째 원판을 to 지점으로 옮긴다.)
        sb.append(start).append(" ").append(to).append('\n');

        // 3. N-1개를 B에서 C로 이동 (mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
        Hanoi(N-1, mid, start, to);
    }
}
