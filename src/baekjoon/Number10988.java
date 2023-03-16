package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] c = br.readLine().toCharArray();
        int front = 0;  // 맨 앞글자
        int back = c.length - 1;    // 맨 뒷글자

        // 앞, 뒤 순서대로 비교
        while (front <= back) {
            if (c[front] == c[back]) {
                front++;
                back--;
            } else {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}