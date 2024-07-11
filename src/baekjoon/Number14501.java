package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] D = new int[N + 2];   // 오늘부터 퇴사일까지 벌 수 있는 최대 수입
        int[] T = new int[N + 1];   // 상담에 필요한 일 수 배열
        int[] P = new int[N + 1];   // 상담을 완료했을 때 받는 수입 배열

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = N; i > 0; i--) {
            if (i + T[i] > N + 1) {
                D[i] = D[i + 1];
            }
            else {
                D[i] = Math.max(D[i + 1], P[i] + D[i + T[i]]);
            }
        }

        System.out.println(D[1]);
    }
}