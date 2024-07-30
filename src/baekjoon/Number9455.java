package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number9455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());   // 행
            int n = Integer.parseInt(st.nextToken());   // 열
            int[][] arr = new int[m][n];    // 박스가 쌓여있는 배열
            int count = 0;  // 박스가 움직이는 거리

            // 배열 초기화
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 박스가 이동한 거리 찾기
            // 박스가 이동한 거리 = 현재 박스 위치보다 아래 칸에 있는 빈 칸의 개수
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
                    if (arr[i][j] == 1) {
                        for (int k = i + 1; k < m; k++) {
                            if (arr[k][j] == 0) {
                                count++;
                            }
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
}