package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number16968 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String plate = br.readLine();
        int result = 1;

        for (int i = 0; i < plate.length(); i++) {
            int num = plate.charAt(i) == 'c' ? 26 : 10;

            if (i > 0 && plate.charAt(i) == plate.charAt(i - 1)) {
                num--;
            }

            result *= num;
        }

        System.out.println(result);
    }
}