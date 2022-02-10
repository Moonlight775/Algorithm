package simpleQuiz;

import java.util.Scanner;

public class CompareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if ( a < -10000 || b < -10000 || a > 10000 || b > 10000 ) return;

        if (a > b) {
            System.out.print(">");
        } else if (a < b) {
            System.out.print("<");
        } else {
            System.out.print("==");
        }
    }
}
