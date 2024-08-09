package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number18406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str = br.readLine().toCharArray();
        int front = 0;
        int back = 0;

        for (int i = 0; i < str.length; i++) {
            if (i < str.length / 2) {
                front += str[i] - '0';
            }
            else {
                back += str[i] - '0';
            }
        }

        if (front == back) {
            System.out.println("LUCKY");
        }
        else {
            System.out.println("READY");
        }
    }
}