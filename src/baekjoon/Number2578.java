package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number2578 {

    static int[][] board = new int[5][5];   // 빙고 배열
    static ArrayList<Integer> num = new ArrayList<>();  // 부르는 수의 리스트
    static int bingo_count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;  // 수를 부른 횟수

        // 빙고판 초기화
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 사회자가 부르는 수의 리스트
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                num.add(Integer.parseInt(st.nextToken()));
            }
        }

        for (int i = 0; i < 25; i++) {
            // 부르는 수에 해당하는 빙고판의 수를 0으로 변환
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (board[j][k] == num.get(i)) {
                        board[j][k] = 0;
                    }
                }
            }

            bingo_count = 0;    // 빙고 개수를 0으로 초기화하지 않으면 누적이 되므로
            getRow();
            getCol();
            getLeft();
            getRight();
            count++;

            if (bingo_count >= 3) {     // 빙고 개수가 3개 이상이 되면 출력 후 종료
                System.out.println(count);
                return;
            }
        }

    }

    // 가로줄 빙고 확인
    public static void getRow() {
        for (int i = 0; i < 5; i++) {
            int t = 0;
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == 0) {
                    t++;
                }
            }
            if (t == 5) {
                bingo_count++;
            }
        }
    }

    // 세로줄 빙고 확인
    public static void getCol() {
        for (int i = 0; i < 5; i++) {
            int t = 0;
            for (int j = 0; j < 5; j++) {
                if (board[j][i] == 0) {
                    t++;
                }
            }
            if (t == 5) {
                bingo_count++;
            }
        }
    }

    // 왼쪽 위에서 아래로 대각선 빙고 확인
    public static void getLeft() {
        int t = 0;
        for (int i = 0; i < 5; i++) {
            if (board[i][i] == 0) {
                t++;
            }
        }
        if (t == 5) {
            bingo_count++;
        }
    }

    // 오른쪽 위에서 아래로 대각선 빙고 확인
    public static void getRight() {
        int t = 0;
        int index = 4;
        for (int i = 0; i < 5; i++) {
            if (board[i][index] == 0) {
                t++;
            }
            index--;
        }
        if (t == 5) {
            bingo_count++;
        }
    }
}