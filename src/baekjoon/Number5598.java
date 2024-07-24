package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] str = br.readLine().toCharArray();

        for (char c : str) {
            if (65 <= c && c <= 67) {
                sb.append((char) (c + 23));
            } else {
                sb.append((char) (c - 3));
            }
        }

        System.out.println(sb);
    }
}