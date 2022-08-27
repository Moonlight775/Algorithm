package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());   // 첫 번째 숫자
            int B = Integer.parseInt(st.nextToken());   // 두 번째 숫자

            if (A == 0 && B == 0) break;

            if (B % A == 0) {       // 첫 번째 숫자가 두 번째 숫자의 약수라면
                sb.append("factor").append('\n');
            }
            else if (A % B == 0) {  // 첫 번째 숫자가 두 번째 숫자의 배수라면
                sb.append("multiple").append('\n');
            }
            else {
                sb.append("neither").append('\n');
            }

        }

        System.out.println(sb);
    }
}
