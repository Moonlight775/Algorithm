package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals("END")) break;

            StringBuilder rev = new StringBuilder(str).reverse();

            sb.append(rev).append('\n');
        }

        System.out.println(sb);
    }
}