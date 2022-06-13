package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());

        final int M = 1234567891;

        long sum = 0;
        long r = 1;

        char[] arr = br.readLine().toCharArray();

        for (int i=0; i<L; i++) {
            sum += (arr[i]-'a' + 1) * r % M;
            r = (r * 31) % M;
        }

        System.out.println(sum%M);
    }
}
