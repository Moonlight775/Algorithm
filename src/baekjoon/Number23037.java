package baekjoon;

import java.util.Scanner;

public class Number23037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] str = sc.next().toCharArray();
        long result = 0;

        for (int i = 0; i < 5; i++) {
            result += Math.pow(str[i] -'0', 5);
        }

        System.out.println(result);
    }
}