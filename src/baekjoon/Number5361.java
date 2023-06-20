package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number5361 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수
        double[] component = {350.34, 230.90, 190.55, 125.30, 180.90};    // 블래스터 라이플, 시각 센서, 청각 센서, 팔, 다리 가격

        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double sum = 0; // 부품 구매 비용

            // component 배열 순서대로 부품개수 입력
            for (int i = 0; i < 5; i++) {
                sum += component[i] * Double.parseDouble(st.nextToken());
            }

            sb.append("$").append(String.format("%.2f", sum)).append('\n');
        }

        System.out.println(sb);
    }
}
