package chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {    // i가 n 이하면 반복
            sum += i;       // sum에 i를 더합니다.
            i++;            // i 값을 1만큼 증가시킵니다.
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + " 입니다.");
    }

}
