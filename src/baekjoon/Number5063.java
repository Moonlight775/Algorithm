package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number5063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken());   // 광고를 하지 않았을 때 수익
            int e = Integer.parseInt(st.nextToken());   // 광고를 했을 때의 수익
            int c = Integer.parseInt(st.nextToken());   // 광고배용

            if ((e - c) > r) {  // (광고 시 수익 - 광고 비용)이 광고를 하지 않았을 때보다 크다면 광고를 해야 이득
                System.out.println("advertise");
            } else if ((e - c) < r) {
                System.out.println("do not advertise");
            } else {
                System.out.println("does not matter");
            }
        }

    }
}
