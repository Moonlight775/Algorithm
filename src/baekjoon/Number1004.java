package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int count = 0;

            // 출발점
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            // 도착점
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine());    // 행성계의 개수

            for (int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());

                // 행성계의 중점
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                // 반지름
                int r = Integer.parseInt(st.nextToken());

                boolean start = check(x1, y1, cx, cy, r);   // 출발점
                boolean end = check(x2, y2, cx, cy, r);     // 도착점

                // start와 end가 둘 다 true면 원 안에 출발점과 도착점이 있다는 뜻
                // start 또는 end 중 하나가 true고 하나는 false라면 원을 무조건 진입 또는 이탈이 있다는 것
                if (!(start && end) && (start || end)) {
                    count++;
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }

    // x  = 출발점 또는 도착점의 x좌표
    // y  = 출발점 또는 도착점의 y좌표
    // cx = 행성계의 x 좌표
    // cy = 행성계의 y 좌표
    // r  = 행성계의 반지름
    // 원의 방정식, 정점 A(a, b)로 부터 r 만큼 떨어진 점 P(x, y)가 있다면 (x-a)^2 + (y-b)^2 = r^2
    public static boolean check(int x, int y, int cx, int cy, int r) {
        return Math.pow(x - cx, 2) + Math.pow(y - cy, 2) < Math.pow(r, 2);
    }

}
