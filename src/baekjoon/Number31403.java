package baekjoon;

import java.util.Scanner;

public class Number31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = sc.nextLine();

        int first = Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C);
        int second = Integer.parseInt(A + B) - Integer.parseInt(C);

        System.out.println(first);
        System.out.println(second);
    }
}