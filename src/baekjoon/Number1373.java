package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int N = str.length();

        // 8진수로 변환하기 위해서 2^3 이므로 2진수를 세 자리씩 자르고 10진수로 변환
        if (N % 3 == 1) {   // 자른 후 한 자리일 경우
            sb.append(str.charAt(0));
        }
        else if (N % 3 == 2) {  // 자른 후 두 자리일 경우
            sb.append((str.charAt(0)-'0')*2 + str.charAt(1)-'0');
        }

        // 세 자리로 잘리는 경우
        for (int i = N % 3; i < N; i += 3) {
            sb.append((str.charAt(i) - '0') * 4 + (str.charAt(i+1) - '0') * 2 + (str.charAt(i+2) - '0'));
        }

        System.out.println(sb);
    }
}
