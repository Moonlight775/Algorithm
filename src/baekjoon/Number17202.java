package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number17202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();

        StringBuilder comb = new StringBuilder();   // A와 B의 번호 혼합

        for (int i = 0; i < A.length(); i++) {
            comb.append(A.charAt(i));
            comb.append(B.charAt(i));
        }

        while (comb.length() > 2) {
            StringBuilder str = new StringBuilder();

            for (int i = 0; i < comb.length() - 1; i++) {
                // 인접한 두 숫자를 더한다.
                // 10이 넘어가게 되면 일의 자리만 필요하므로 %10 해준다.
                str.append(((comb.charAt(i) - '0') + (comb.charAt(i + 1) - '0')) % 10);
            }

            comb = new StringBuilder(str.toString());
        }

        System.out.println(comb);
    }
}