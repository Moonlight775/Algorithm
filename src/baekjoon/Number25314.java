package baekjoon;

import java.util.Scanner;

public class Number25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // N 바이트 정수

        System.out.println("long ".repeat(N/4) + "int");
    }
}