package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number3023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());   // 행
        int C = Integer.parseInt(st.nextToken());   // 열
        int row = 2 * R;    // 카드 행
        int col = 2 * C;    // 카드 열

        char[][] card = new char[row][col];

        // 카드 왼쪽 위 1/4 초기화
        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                card[i][j] = str.charAt(j);
            }
        }

        // 카드 오른쪽 위 1/4 초기화
        for (int i = 0; i < R; i++) {
            for (int j = C; j < col; j++) {
                card[i][j] = card[i][col - j - 1];
            }
        }

        // 카드 아래 1/2 초기화
        for (int i = R; i < row; i++) {
            for (int j = 0; j < col; j++) {
                card[i][j] = card[row - i - 1][j];
            }
        }

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()) - 1;   // 에러 행
        int B = Integer.parseInt(st.nextToken()) - 1;   // 에러 열

        card[A][B] = card[A][B] == '#' ? '.' : '#'; // 에러 부분만 교체

        StringBuilder sb = new StringBuilder();
        for (char[] ch : card) {
            for (char val : ch) {
                sb.append(val);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}