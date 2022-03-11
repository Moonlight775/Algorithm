package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int origin = N;
        int count = 0;

        while (true) {
            N = (N%10*10) + (N/10+N%10)%10;
            count++;
            if (origin == N) break;
        }
        System.out.println(count);
    }
}
