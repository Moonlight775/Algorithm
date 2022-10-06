package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());   // 게임 횟수
        int Y = Integer.parseInt(st.nextToken());   // 이긴 게임
        int Z = (int) ((double)Y * 100 / X);    // 승률

        // 승률이 99 이상일 경우는 계속 게임을 진행해도 승률은 변하지 않는다.
        if (Z >= 99) {
            System.out.println(-1);
        }
        // 승률 Z에서 Z+1이 되는 최솟값을 구하면 되는데, 수식은 아래와 같다.
        else {
            int result = (int) Math.ceil((X*(Z+1) - 100*Y) / (double)(-Z + 99));
            System.out.println(result);
        }

    }
}
