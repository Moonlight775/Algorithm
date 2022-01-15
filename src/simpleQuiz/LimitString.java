package simpleQuiz;

import java.util.Scanner;

public class LimitString {
    public static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String a = sc.nextLine();

        System.out.println("입력값은 " + solution(a) + "입니다.");
    }
}
