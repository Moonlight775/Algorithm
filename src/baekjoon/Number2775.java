package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] apt = new int[15][15];  // 아파트 배열

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스 수

        for (int i=1; i < apt.length; i++) {
            apt[i][1] = 1;  // 각 층의 1호
            apt[0][i] = i;  // 0층 i호
        }

        for (int i=1; i<apt.length; i++) {      // 층 수

            for (int j=2; j<apt.length; j++) {  // 호 수
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
                // 2층 3호로 예를 들면 (2층 2호)+(1층 3호)의 인원과 같다.
                // k층의 2~14호는 k-1층 2~14호의 인원 수만큼의 크기로 변화한다.
                // 즉, k층 n호는 (k-1층 n호 인원) + (k층 n-1호 인원) 이 된다.
            }
        }

        for (int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());    // 층
            int n = Integer.parseInt(br.readLine());    // 호
            sb.append(apt[k][n]).append('\n');
        }

        System.out.println(sb);
    }
}
