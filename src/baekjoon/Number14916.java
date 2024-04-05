package baekjoon;

import java.util.Scanner;

public class Number14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 거스름돈 액수
        int count = 0;  // 동전 개수

        while (n > 0) {
            if (n % 5 == 0) {
                count += n / 5; // 5원의 개수
                break;
            }

            // 5로 나누어지지 않으면 2원을 거슬러주며 5로 나누어질 때까지 반복
            n -= 2;
            count++;
        }

        if (n < 0) {    // 거스름돈이 나누어 떨어지지 않으면 음수가 된다.
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}