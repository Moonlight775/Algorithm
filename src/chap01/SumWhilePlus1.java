package chap01;

import java.util.Scanner;

public class SumWhilePlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("i의 최종값을 확인합니다.");
        System.out.println("n의 값 : ");
        int n = scanner.nextInt();

        int i = 1;

        while (i <= n) {
            System.out.println("i의 값은 " + i + "입니다.");
            i++;
        }
        System.out.println("i의 최종값은 " + i + "입니다.");
    }
}
