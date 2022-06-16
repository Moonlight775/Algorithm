package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(contact(x1,y1,r1,x2,y2,r2)).append('\n');
        }
        System.out.println(sb);
    }

    public static int contact (int x1, int y1, int r1, int x2, int y2, int r2) {
        int distance_pow = (int)(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));    // 두 점 사이의 거리 공식, distance_pow는 거리의 제곱값이다.

        if (x1 == x2 && y1 == y2 && r1 == r2) {         // 두 점이 같은 위치고 마린과의 거리도 같을 때 위치의 개수는 무한대
            return -1;
        }

        else if (distance_pow < Math.pow(r2-r1, 2)) {   // 두 점의 거리보다 두 원의 반지름 길이 차가 길면 내접하지 않고 한 원안에 원이 포함된다.
            return 0;
        }

        else if (distance_pow > Math.pow(r2+r1, 2)) {   // 두 점의 거리가 두 원의 반지름 길이 합보다 길면 멀리 떨어져 있으므로 접점이 없다.
            return 0;
        }

        else if (distance_pow == Math.pow(r2-r1, 2)) {  // 두 점의 거리와 두 원의 반지름 길이 차가 같다면 내접한다.
            return 1;
        }

        else if (distance_pow == Math.pow(r2+r1, 2)) {  // 두 점의 거리와 두 원의 반지름 길이 합이 같다면 외접한다.
            return 1;
        }

        else {                                          // 그 이외의 경우는 접점이 2개 생긴다.
            return 2;
        }
    }
}
