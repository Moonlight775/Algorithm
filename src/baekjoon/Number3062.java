package baekjoon;

import java.util.Scanner;

public class Number3062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // 테스트 케이스의 개수

        while (T-- > 0) {
            String N = sc.next();
            int rev = reverse(N);   // N을 뒤집은 정수
            int sum = Integer.parseInt(N) + rev;    // N과 뒤집은 수의 합

            if (check(sum)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }

    // N과 뒤집은 수의 합이 좌우 대칭인지 확인
    private static boolean check(int N) {
        String sum = Integer.toString(N);

        for (int i = 0; i < sum.length() / 2; i++) {
            if (sum.charAt(i) != sum.charAt(sum.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // 정수 뒤집기
    private static int reverse(String N) {
        StringBuilder sb = new StringBuilder(N);
        return Integer.parseInt(String.valueOf(sb.reverse()));
    }
}