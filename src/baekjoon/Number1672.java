package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1672 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[][] chart = new char[4][4];

        // 암호표 초기화
        chart[0][0] = chart[0][2] = chart[1][3] = chart[2][0] = chart[3][1] = 'A';
        chart[0][1] = chart[1][0] = chart[2][2] = 'C';
        chart[0][3] = chart[1][1] = chart[2][3] = chart[3][0] = chart[3][2] = 'G';
        chart[1][2] = chart[2][1] = chart[3][3] = 'T';

        String str = br.readLine();
        int length = str.length();

        if (length == 1) {
            System.out.println(str);
            return;
        }

        char chart_ch = chart[getNum(str.charAt(N-1))][getNum(str.charAt(N-2))];

        for (int i = length - 2; i > 0; i--) {
            int row = getNum(str.charAt(i - 1));    // 행
            int col = getNum(chart_ch);        // 열

            chart_ch = chart[row][col];
        }

        System.out.println(chart_ch);
    }

    // 행과 열의 위치를 알기 위한 메소드
    public static int getNum(char ch) {
        if (ch == 'A') {
            return 0;
        } else if (ch == 'G') {
            return 1;
        } else if (ch == 'C') {
            return 2;
        } else {
            return 3;
        }
    }
}
