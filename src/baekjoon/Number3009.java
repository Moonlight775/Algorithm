package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i=0; i<x.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int ans_x = 0;  // x좌표
        int ans_y = 0;  // y좌표

        // x값이 다른 값만 출력
        if (x[0] != x[1] && x[1] == x[2]) {
            ans_x = x[0];
        }
        else if (x[0] == x[2] && x[1] != x[2]) {
            ans_x = x[1];
        }
        else if (x[0] == x[1] && x[1] != x[2]) {
            ans_x = x[2];
        }

        // y값이 다른 값만 출력
        if (y[0] != y[1] && y[1] == y[2]) {
            ans_y = y[0];
        }
        else if (y[0] == y[2] && y[1] != y[2]) {
            ans_y = y[1];
        }
        else if (y[0] == y[1] && y[1] != y[2]) {
            ans_y = y[2];
        }

        System.out.println(ans_x + " " + ans_y);
    }
}
