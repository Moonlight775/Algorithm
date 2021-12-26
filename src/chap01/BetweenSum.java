package chap01;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenSum {
    static int sumof(int a, int b) {
        int min;
        int max;
        int i;
        int sum = 0;

        if(a <= b) {
            min = a;
            max = b;
        }else {
            min = b;
            max = a;
        }

        for (i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a와 b의 값을 입력해주세요. a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();

        System.out.println("a와 b를 포함한 그 사이의 합은 : " + sumof(a, b));

    }
}
