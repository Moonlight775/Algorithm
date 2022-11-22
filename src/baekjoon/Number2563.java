package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 색종이의 수

        int[][] paper = new int[100][100];  // 가로, 세로 크기가 100인 도화지

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int X = Integer.parseInt(st.nextToken());   // 도화지 왼쪽 변과 떨어진 거리
            int Y = Integer.parseInt(st.nextToken());   // 도화지 아래쪽 변과 떨어진 거리

            // 검은색 색종이에 해당하는 곳을 1로 초기화
            for (int i=X; i<X+10; i++) {
                for (int j=Y; j<Y+10; j++) {
                    paper[i][j] = 1;
                }
            }

        }

        int count = 0;  // 검은 영역 넓이

        // 도화지에서 검은 영역에 해당되면 count +1씩 증가
        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) {
                if (paper[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
