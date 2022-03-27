package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        String second = br.readLine();

        for (int i=2; i>=0; i--) {
            System.out.println((second.charAt(i)-'0') * first);
        }
        System.out.println(first * Integer.parseInt(second));
    }
}
