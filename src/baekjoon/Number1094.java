package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1094 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int stick = 64;         // 막대 길이
        int count = 0;          // 풀로 붙이는 횟수

        while (X > 0) {
            if (stick > X) {
                stick /= 2;
            }
            else {
                count++;
                X -= stick;
            }
        }

        System.out.println(count);
    }
}
