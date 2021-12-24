package chap01;

import java.util.Scanner;

public class SumFor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("임의의 값을 입력해주세요 : ");
        int n = scanner.nextInt();


        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
            if(i != n) {
                System.out.printf("%d + ", i);
            }else{
                System.out.printf("%d", i);
            }
        }
        System.out.println(" = " + sum);
    }
}
