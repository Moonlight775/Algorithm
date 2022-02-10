package simpleQuiz;

import java.util.Scanner;

public class Number1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > 2100000000 || b > 2100000000 || c > 2100000000) return;

        if(b >= c) {
            System.out.print("-1");
        } else {
            System.out.print((a/(c-b))+1);
        }
    }
}
