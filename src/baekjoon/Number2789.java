package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] remove = "CAMBRIDGE".toCharArray();

        for (char c : remove) {
            if (str.indexOf(c) != -1) {
                str = str.replace(String.valueOf(c), "");
            }
        }

        System.out.println(str);
    }
}