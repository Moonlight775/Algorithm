package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());        // 컵의 위치를 바꾼 횟수
        int ball = 1;   // 처음 공의 위치

        for (int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if (ball == X) {        // 공이 X번 컵의 위치와 같다면
                ball = Y;           // X번 컵과 Y번 컵의 위치가 바뀌므로 공은 Y번 컵으로 이동
            }
            else if (ball == Y) {   // 공이 Y번 컵의 위치에 있다면
                ball = X;           // X번 컵과 Y번 컵의 위치가 바뀌므로 공은 X번 컵으로 이동
            }

        }

        System.out.println(ball);   // 공 위치 출력
    }
}
