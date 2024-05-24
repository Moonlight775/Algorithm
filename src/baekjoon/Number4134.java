package baekjoon;

import java.util.Scanner;

public class Number4134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // 테스트 케이스의 수

        for (int i=0; i<t; i++) {
            long n = sc.nextLong(); // 정수

            while (true) {
                boolean flag = false;   // false 면 소수, true 는 소수아님

                for (long j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {   // 나누어 떨어지면 소수 아님
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    if (n < 2) {    // n이 0, 1라면 2 출력
                        n = 2;
                    }
                    System.out.println(n);
                    break;
                }

                n++;    // 다음 정수가 소수인지 판별하기 위해 +1
            }   // while end
        }   // for end

    }
}