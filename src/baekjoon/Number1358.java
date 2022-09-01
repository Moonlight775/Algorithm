package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1358 {

    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());   // 가로
        int H = Integer.parseInt(st.nextToken());   // 세로
        int X = Integer.parseInt(st.nextToken());   // x좌표
        int Y = Integer.parseInt(st.nextToken());   // y좌표
        int P = Integer.parseInt(st.nextToken());   // 선수의 수

        for (int i=0; i<P; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());   // 선수의 x 좌표
            int b = Integer.parseInt(st.nextToken());   // 선수의 y 좌표

            isIn(a, b, W, H, X, Y);
        }

        System.out.println(count);

    }

    // a = 선수의 x 좌표
    // b = 선수의 y 좌표
    // w = 링크의 가로 크기
    // h = 링크의 세로 높이
    // x = 링크의 x 좌표
    // y = 링크의 y 좌표
    private static void isIn(int a, int b, int w, int h, int x, int y) {
        // 링크의 왼쪽 반원안에 들었을 경우
        if (Math.pow((a-x), 2) + Math.pow(b-(y+h/2), 2) <= Math.pow(h/2, 2) && a < x) {
            count++;
        }
        // 링크의 사각형 부분에 들었을 경우
        else if (a >= x && a<= x+w && b >= y && b <= y+h) {
            count++;
        }
        // 링크의 오른쪽 반원안에 들었을 경우
        else if (Math.pow((a-(x+w)), 2) + Math.pow(b-(y+h/2), 2) <= Math.pow(h/2, 2) && a > x+w) {
            count++;
        }
    }
}
