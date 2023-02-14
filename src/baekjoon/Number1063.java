package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1063 {

    private static int king_row;    // 킹의 행 위치
    private static int king_col;    // 킹의 열 위치
    private static int rock_row;    // 돌의 행 위치
    private static int rock_col;    // 돌의 열 위치

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String king = st.nextToken();   // 킹의 위치
        String rock = st.nextToken();   // 돌의 위치
        int N = Integer.parseInt(st.nextToken());   // 움직이는 횟수

        king_row = Math.abs(king.charAt(1)-'0'-8);   // 배열은 0부터 시작하므로 가장 아래가 0으로 되기 위해서는 -8을 해준다.
        king_col = king.charAt(0)-65;   // 문자를 숫자로 변경, A -> 0
        rock_row = Math.abs(rock.charAt(1)-'0'-8);  // 배열은 0부터 시작하므로 가장 아래가 0으로 되기 위해서는 -8을 해준다.
        rock_col = rock.charAt(0)-65;   // 문자를 숫자로 변경, H -> 7

        while (N-- > 0) {
            String move = br.readLine();

            if (checkMove(move)) {
                moving(move);
            }
        }

        System.out.print((char)(king_col+65));
        System.out.println(Math.abs(king_row-8));
        System.out.print((char)(rock_col+65));
        System.out.println(Math.abs(rock_row-8));
    }

    // 행동에 따라 이동
    // T와 B가 헷갈릴 수 있는데, 문제와는 다르게 8의 위치를 0으로, 1의 위치를 7로 가정하여 행동
    // 그렇기 때문에 -1을 해주면 위로, +1을 해주면 아래로 간다.
    private static void moving(String move) {
        switch (move.charAt(0)) {
            case 'R' :
                king_col++;
                rock_col++;
                break;
            case 'L' :
                king_col--;
                rock_col--;
                break;
            case 'T' :
                king_row--;
                rock_row--;
                break;
            case 'B' :
                king_row++;
                rock_row++;
                break;
        }

        if (move.length() > 1) {
            switch (move.charAt(1)) {
                case 'T' :
                    king_row--;
                    rock_row--;
                    break;
                case 'B' :
                    king_row++;
                    rock_row++;
                    break;
            }
        }
    }

    // 입력대로 이동할 때 킹이나 돌이 체스판 밖으로 나가는지 확인
    // 밖으로 나갈 경우 행동 X
    private static boolean checkMove(String move) {
        switch (move.charAt(0)) {
            case 'R' : if (king_col == 7 || rock_col == 7) return false;
                break;
            case 'L' : if (king_col == 0 || rock_col == 0) return false;
                break;
            case 'T' : if (king_row == 0 || rock_row == 0 ) return false;
                break;
            case 'B' : if (king_row == 7 || rock_row == 7) return false;
                break;
        }

        if (move.length() > 1) {
            switch (move.charAt(1)) {
                case 'T' : if (king_row == 0 || rock_row == 0 ) return false;
                    break;
                case 'B' : if (king_row == 7 || rock_row == 7) return false;
                    break;
            }
        }

        return true;
    }
}
