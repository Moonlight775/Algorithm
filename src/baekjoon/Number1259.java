package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        while(true) {
            String str = br.readLine();     // 입력된 문자열
            sb = new StringBuilder(str);
            String reverse = sb.reverse().toString();   // 문자열을 뒤집어 주기 위해 StringBuilder 클래스의 reverse()사용

            if(Integer.parseInt(str) == 0) break;   // 0을 맨 밑에서 판단해준다면 yes가 출력되므로 그 전에 판단하여 while문을 제한해준다.

            if(Integer.parseInt(str) == Integer.parseInt(reverse)) {    // 문자열로 받았지만 서로 수로서 비교해야 하므로 int로 형변환 해준다.
                System.out.println("yes");  // 역순과도 같다면 yes 출력
            } else {
                System.out.println("no");
            }
        }
    }
}
