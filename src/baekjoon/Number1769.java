package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int count = 0;  // 반복 횟수

        while (X/10 != 0) {     // 일의 자리 수가 아니라면 반복
            int length = (int)(Math.log10(X)+1);    // 정수 X의 길이
            int num = 0;

            // 각 자리수 합 해주기
            for (int i=0; i<length; i++) {
                num += X%10;
                X = X/10;
            }

            X = num;
            count++;
        }

        System.out.println(count);
        if (X == 3 || X == 6 || X == 9) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
