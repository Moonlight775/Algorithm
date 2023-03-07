package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hap = Integer.parseInt(st.nextToken());
        int cha = Integer.parseInt(st.nextToken());

        int x = (hap + cha) / 2;
        int y = (hap - cha) / 2;

        if (hap < cha) {
            System.out.println(-1);
        }
        else {
            if (x + y == hap && x - y == cha) {
                System.out.println(x + " " + y);
            } else {
                System.out.println(-1);
            }
        }
    }
}
