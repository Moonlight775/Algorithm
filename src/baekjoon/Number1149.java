package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 집의 개수

        int[][] house = new int[N][3];

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            house[i][0] = Integer.parseInt(st.nextToken());     // 빨강
            house[i][1] = Integer.parseInt(st.nextToken());     // 초록
            house[i][2] = Integer.parseInt(st.nextToken());     // 파랑
        }

        for (int i=1; i<N; i++) {
            house[i][0] += Math.min(house[i-1][1], house[i-1][2]);
            house[i][1] += Math.min(house[i-1][0], house[i-1][2]);
            house[i][2] += Math.min(house[i-1][0], house[i-1][1]);
        }

        int result = Math.min(house[N-1][0], Math.min(house[N-1][1], house[N-1][2]));

        System.out.println(result);
    }
}
