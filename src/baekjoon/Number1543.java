package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String comp = br.readLine();
        int str_length = str.length();
        int comp_length = comp.length();

        String after = str.replaceAll(comp, "");

        int after_length = after.length();

        System.out.println((str_length - after_length) / comp_length);
    }
}
