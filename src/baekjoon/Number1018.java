package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1018 {

        public static boolean[][] arr;
        public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 행
        int M = Integer.parseInt(st.nextToken());   // 열

        arr = new boolean[N][M];

        // 배열 입력
        for (int i=0; i<N; i++) {
            String str = br.readLine(); // 한 행의 문자열

            for (int j=0; j<M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;   // W일 때 true
                } else {
                    arr[i][j] = false;  // B일 때 false
                }
            }
        }

        int row = N-7;
        int col = M-7;

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int end_x = x+8;    // 8X8이므로 8을 더해준다. 하기 for문 조건범위를 i=x등으로 잡아주는 이유
        int end_y = y+8;
        int cnt = 0;

        boolean TF = arr[x][y]; // 첫 번째 칸의 색 (true, false로 판단)

        for (int i=x; i<end_x; i++) {
            for (int j=y; j<end_y; j++) {

                if (arr[i][j] != TF) {  // 올바른 색이 아닐경우 카운트 증가
                    cnt++;
                }

                TF = !TF;   // 다음 칸은 색이 바뀌므로 true->false, false->true로 값을 변경
            }
            TF = !TF;
        }

        // 첫 번째 칸을 기준으로 할 때의 색칠 할 개수(cnt)와
        // 첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의 색칠 할 개수(64-cnt)
        // 중 최솟값을 cnt에 저장
        cnt = Math.min(cnt, 64-cnt);

        // 이전까지의 경우 중 최솟값보다 현재 cnt 값이 더 작을 경우 최솟값을 갱신
        min = Math.min(min, cnt);
    }
}
