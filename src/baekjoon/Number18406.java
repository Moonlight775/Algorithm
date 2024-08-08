package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number18406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        char[] front = N.substring(0, N.length() / 2).toCharArray();
        char[] back = N.substring(N.length() / 2).toCharArray();
        int sum_front = 0;
        int sum_back = 0;

        for (int i = 0; i < N.length() / 2; i++) {
            sum_front += front[i];
            sum_back += back[i];
        }

        if (sum_front == sum_back) {
            System.out.println("LUCKY");
        }
        else {
            System.out.println("READY");
        }
    }
}