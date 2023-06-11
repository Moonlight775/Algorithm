package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double X = Integer.parseInt(st.nextToken());   // 가격 정보
        double Y = Integer.parseInt(st.nextToken());   // 그램 수
        double min = (1000 / Y) * X;    // 최저가

        int N = Integer.parseInt(br.readLine());    // 세븐25를 제외한 편의점의 개수

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());

            double Xi = Integer.parseInt(st.nextToken());   // 가격 정보
            double Yi = Integer.parseInt(st.nextToken());   // 그램 수

            min = Math.min(min, (1000 / Yi) * Xi);
        }

        System.out.printf("%.2f", min);
    }
}
