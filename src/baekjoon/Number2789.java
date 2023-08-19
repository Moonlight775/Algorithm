package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String result = str
                .replace("C", "")
                .replace("A", "")
                .replace("M", "")
                .replace("B", "")
                .replace("R", "")
                .replace("I", "")
                .replace("D", "")
                .replace("G", "")
                .replace("E", "");

        System.out.println(result);
    }
}
