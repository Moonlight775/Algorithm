package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            double num = Double.parseDouble(st.nextToken());     // 값
            String unit = st.nextToken();   // 단위

            switch (unit) {
                case "kg":
                    num *= 2.2046;  // 파운드로 변환
                    System.out.printf("%.4f lb%n", num);
                    break;

                case "lb":
                    num *= 0.4536;  // kg으로 변환
                    System.out.printf("%.4f kg%n", num);
                    break;

                case "l":
                    num *= 0.2642;  // 갤런으로 변환
                    System.out.printf("%.4f g%n", num);
                    break;

                case "g":
                    num *= 3.7854;  // 리터로 변환
                    System.out.printf("%.4f l%n", num);
                    break;
            }
        }
    }
}