package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number14405 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        S = S.replaceAll("pi|ka|chu", "");

        if (S.equals("")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}