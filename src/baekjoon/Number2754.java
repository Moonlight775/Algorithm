package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2754 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String score = br.readLine();
        double num = 0.0;

        if (score.equals("F")) {
            System.out.println(num);
            return;
        }

        switch (score.charAt(0)) {
            case 'A' :
                num = 4.0;
                break;

            case 'B' :
                num = 3.0;
                break;

            case 'C' :
                num = 2.0;
                break;

            case 'D' :
                num = 1.0;
                break;
        }

        if (score.charAt(1) == '+') {
            num += 0.3;
        } else if (score.charAt(1) == '-') {
            num -= 0.3;
        }

        System.out.println(num);
    }
}