package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String N = br.readLine();   // 호수판에 들어갈 숫자
            int width = 2;  // 모든 숫자에 양 여백이 있으므로 2로 시작

            if (N.equals("0")) break;    // 0이 들어오면 멈춤

            width = width + N.length()-1;   // 숫자 사이 여백 더하기

            for (int i=0; i<N.length(); i++) {
                char c = N.charAt(i);

                if (c == '1') { // 숫자 1이면 여백은 +2
                    width = width + 2;
                }
                else if (c == '0') {    // 0이라면 여백 +4
                    width = width + 4;
                }
                else {  // 나머지는 여백 3씩 차지
                    width = width +3;
                }
            }

            sb.append(width).append('\n');
        }

        System.out.println(sb);
    }
}
