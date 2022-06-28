package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int D = Integer.parseInt(st.nextToken());   // 대각선 길이
        int H = Integer.parseInt(st.nextToken());   // 높이 비율
        int W = Integer.parseInt(st.nextToken());   // 너비 비율

        // 화면비율 x:y, 가로 W, 세로 H -> W = xz, H = yz (z:비례상수)
        // A^2 = (xz)^2 + (yz)^2 = z^2(x^2 + y^2)
        // z = √( A^2 / (x^2+y^2) )
        double rate = Math.sqrt((double) (D*D) / (W*W + H*H));

        // 가로길이 = √( 대각선길이^2 / (가로비율^2 + 세로비율^2) ) x 가로비율
        // 세로길이 = √( 대각선길이^2 / (가로비율^2 + 세로비율^2) ) x 세로비율
        int width = (int)(rate * W);
        int height = (int)(rate * H);

        System.out.print(height + " " + width);
    }
}
