package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number11943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());   // 첫 번째 바구니 사과의 수
        int B = Integer.parseInt(st.nextToken());   // 첫 번째 바구니 오렌지의 수

        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());   // 두 번째 바구니 사과의 수
        int D = Integer.parseInt(st.nextToken());   // 두 번째 바구니 오렌지의 수

        // 첫 번째 바구니에서 사과를 옮겼다면 두 번째 바구니에서는 오렌지를 옮겨야 한다.
        // 두 번째 바구니에서 사과를 옮겼다면 첫 번째 바구니에서는 오렌지를 옮겨야 한다.
        // 즉, 두 방법 중 적게 옮겨도 되는 횟수를 출력
        System.out.println(Math.min((A + D), (B + C)));
    }
}