package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number14490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] arr = s.split(":");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        int r = gcd(n, m);  // 최대 공약수

        System.out.println(n / r + ":" + m / r);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}