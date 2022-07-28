package baekjoon;

import java.util.Scanner;

public class Number2914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());    // 곡의 개수
        int I = Integer.parseInt(sc.next());    // 평균값

        int melody = A * (I - 1) +1;

        System.out.println(melody);
    }
}
