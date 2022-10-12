package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String X = br.readLine();
        int count = 0;  // 반복횟수

        while (X.length() != 1) {
            int num = 0;

            for (int i=0; i<X.length(); i++) {
                num += X.charAt(i) - '0';
            }

            X = String.valueOf(num);
            count++;
        }

        System.out.println(count);
        // 홀수인지 아닌지 판단
        if (Integer.parseInt(X) % 3 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
