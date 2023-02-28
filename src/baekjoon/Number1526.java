package baekjoon;

import java.util.Scanner;

public class Number1526 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String regExp = "^[4,7]+$"; // 4와 7만 해당하는 값을 찾도록 정규식 생성

        for (int i = N; i >= 4; i--) {
            String str = String.valueOf(i);

            if (str.matches(regExp)) {
                System.out.println(i);
                return;
            }
        }
    }
}
