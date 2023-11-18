package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number9610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 점의 개수
        int[] coor = new int[5];    // 좌표 배열

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x > 0 && y > 0) {           // x, y가 양수라면
                coor[0]++;                  // 1 사분면
            } else if (x < 0 && y > 0) {    // x가 음수, y가 양수라면
                coor[1]++;                  // 2사분면
            } else if (x < 0 && y < 0) {    // x, y가 음수라면
                coor[2]++;                  // 3사분면
            } else if (x > 0 && y < 0) {    // x가 양수, y가 음수라면
                coor[3]++;                  // 4사분면
            } else {                        // x와 y가 같다면
                coor[4]++;                  // AXIS +1
            }
        }

        System.out.println("Q1: " + coor[0]);
        System.out.println("Q2: " + coor[1]);
        System.out.println("Q3: " + coor[2]);
        System.out.println("Q4: " + coor[3]);
        System.out.println("AXIS: " + coor[4]);
    }
}