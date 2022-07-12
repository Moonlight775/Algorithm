package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1010 {

    static int[][] cb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스 개수

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            cb = new int[M+1][N+1];     // (N <= M)으로 _MC_N

            sb.append(combination(M,N)).append('\n');
        }

        System.out.println(sb);
    }

    public static int combination(int m, int n) {
        if (cb[m][n] > 0) {         // 이미 값이 존재하면 재활용
            return cb[m][n];
        }

        if (m == n || n == 0) {     // mCm = mC0 = 1
            return cb[m][n] = 1;
        }

        return cb[m][n] = combination(m-1, n-1) + combination(m-1, n);  // _mC_n = _m-1C_n-1 + _m-1C_n
    }
}
