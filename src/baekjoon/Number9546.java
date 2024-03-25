package baekjoon;

import java.util.Scanner;

public class Number9546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();   // 테스트 케이스의 수

        while (t-- > 0) {
            int k = sc.nextInt();
            double num = 0;

            for (int i = 0; i < k; i++) {
                num = (num + 0.5) * 2;
            }

            System.out.println((int)num);
        }
    }
}