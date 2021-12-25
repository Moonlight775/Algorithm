package chap01;

import java.util.Scanner;

public class GaussSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int one;
//        System.out.printf("1부터 n까지의 합 \nn의 값은 : ");
//
//        int num = sc.nextInt();
//        int total = 0;
//
//        for(one = 1; one<=num; one++){
//            total += one;
//        }
//        System.out.printf("\n1부터 %d까지의 합 = %d", num, total);

        int result;
        System.out.print("1부터 n까지의 합 \nn의 값은 : ");
        int n = sc.nextInt();

        result = (1 + n) * (n / 2);

        if(n%2 != 0) {
            result += (n + 1) / 2;
        }
        System.out.println("1부터 n까지의 합 = " + result);
    }
}
