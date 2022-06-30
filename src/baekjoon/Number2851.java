package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int result = 0;

        for (int i=0; i<10; i++) {
            sum += Integer.parseInt(br.readLine());

            if (Math.abs(result-100) >= Math.abs(sum-100)) {
                result = sum;
            }
        }
        System.out.println(result);
    }
}
