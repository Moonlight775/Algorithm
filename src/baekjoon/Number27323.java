package baekjoon;

import java.util.Scanner;

public class Number27323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();   // 세로 길이
        int B = sc.nextInt();   // 가로 길이

        System.out.println(A * B);  // 직사각형 넓이 = 세로 길이 X 가로 길이
    }
}