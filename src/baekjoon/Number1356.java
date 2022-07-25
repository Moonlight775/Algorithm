package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int front, back;
        boolean check = false;

        String str = br.readLine();

        for (int i=0; i<str.length()-1; i++) {
            front = 1;
            back = 1;

            // 자른 후 앞 부분 곱의 값
            for (int j=0; j<=i; j++) {
                front *= str.charAt(j) - '0';
            }

            // 자른 후 뒷 부분 곱의 값
            for (int j=i+1; j<str.length(); j++) {
                back *= str.charAt(j) - '0';
            }

            if (front == back) {
                check = true;
                break;
            }
        }

        if (check) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
