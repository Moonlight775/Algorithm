package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int cnt = 1;

        if(X == 1) {
            System.out.println("1/1");
        }

        int denominator;    // 분모
        int change = 1;     // 분모의 변화를 위한 변수

        while(cnt != X){
            int numerator = 1;  // 분자
            change++;   // 두 번째 while문이 끝나면 1씩 증가하도록
            denominator = change;   // 분모가 1씩 증가하도록 (1, 2, 3, ...)

            while(denominator >= 1) {   // 분모가 0이 되면 중지
                cnt++;  // 순번
                if(cnt == X) {
                    System.out.println(numerator + "/" + denominator);
                    break;
                }
                denominator--;  // 분모는 1씩 감소
                numerator++;    // 분자는 1씩 증가
            }
        }

    }
}
