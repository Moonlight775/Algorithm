package baekjoon;

import java.util.Scanner;

public class Number5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();   // 10권 가격
        int sum = 0;    // 9권 합한 가격

        // 9권 가격 총합
        for (int i = 0; i < 9; i++) {
            sum += sc.nextInt();
        }

        System.out.println(total - sum);
    }
}
