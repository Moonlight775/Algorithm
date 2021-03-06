package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && b == c) {
            System.out.println(10000 + a*1000);
        } else if (a == b || a == c) {
            System.out.println(1000 + a*100);
        } else if (b == c) {
            System.out.println(1000 + b*100);
        } else {
            System.out.println(Math.max(Math.max(a, b), c) *100);
        }

        /*int result = 0;
        int max = 0;

        if (a == b && b == c) {
            result = 10000 + a*1000;
        } else if (a==b && b!=c) {
            result = 1000 + a*100;
        } else if (b==c && a!=b) {
            result = 1000 + b*100;
        } else if (a==c && a!=b) {
            result = 1000 + a*100;
        } else if (a!=b && b!=c && a!=c) {
            max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            result = max*100;
        }
        System.out.println(result);*/
    }
}
