package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 스크린 칸의 수
        int M = Integer.parseInt(st.nextToken());   // 바구니가 차지하는 칸
        int J = Integer.parseInt(br.readLine());    // 떨어지는 사과의 개수
        int start = 1;              // 바구니 왼쪽 끝
        int end = start + M - 1;    // 바구니 오른쪽 끝
        int move = 0;

        while (J-- > 0) {
            int place = Integer.parseInt(br.readLine());

            if (end < place) {          // 바구니 오른쪽에 사과가 떨어진다면
                move += place - end;    // 바구니 오른쪽이 사과 위치까지 움직이는 거리
                end = place;            // 사과 떨어지는 위치로 바구니 오른쪽 위치
                start = end - M + 1;    // 바구니 왼쪽 위치
            }
            else if (start > place) {   // 바구니 왼쪽에 사과가 떨어진다면
                move += start - place;  // 바구니 왼쪽이 사과 위치까지 움직이는 거리
                start = place;          // 사과 떨어지는 위치로 바구니 왼쪽 위치
                end = start + M - 1;    // 바구니 오른쪽 위치
            }
        }

        System.out.println(move);
    }
}