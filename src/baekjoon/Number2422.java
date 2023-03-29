package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2422 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 아이스크림 수
        int M = Integer.parseInt(st.nextToken());   // 피해야하는 조합 수
        int[][] combi = new int[N+1][N+1];
        int count = 0;

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            combi[n1][n2]++;
        }

        for (int i = 1; i <= N - 2; i++) {
            for (int j = i + 1; j <= N - 1; j++) {
                for (int k = j + 1; k <= N; k++) {
                    if (combi[i][j] > 0 || combi[j][k] > 0 || combi[i][k] > 0) {
                        continue;
                    }
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
