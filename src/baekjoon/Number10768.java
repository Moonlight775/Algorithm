package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10768 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int month = Integer.parseInt(br.readLine());    // 월
        int day = Integer.parseInt(br.readLine());      // 날짜

        if (month < 2) {
            System.out.println("Before");
        } else if (month == 2) {
            if (day > 18) {
                System.out.println("After");
            } else if (day == 18) {
                System.out.println("Special");
            } else {
                System.out.println("Before");
            }
        } else {
            System.out.println("After");
        }
    }
}