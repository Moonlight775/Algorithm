package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());    // 링의 개수

        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstRing = Integer.parseInt(st.nextToken());   // 첫 번째 링이 기준이므로 따로 담기

        for (int i=0; i<N-1; i++) {     // 첫 번째 링은 따로 뺏으므로 조건 범위는 N-1로 줄이기
            int nextRing = Integer.parseInt(st.nextToken());

            int gcd = gcd(firstRing, nextRing);     // 기약분수를 만들기 위해 최대 공약수 구하기

            sb.append(firstRing/gcd).append("/").append(nextRing/gcd).append('\n');
        }

        System.out.println(sb);
    }

    // 최대 공약수 메소드
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;  // r = 나머지

            a = b;
            b = r;
        }
        return a;
    }
}
