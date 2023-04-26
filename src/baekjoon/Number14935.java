package baekjoon;

import java.util.Scanner;

public class Number14935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        // 함수 F를 반복 수행하다보면 어떤 수여도 결국 일의 자리만 남게 된다.
        // NFA의 경우는 없으므로 FA를 출력
        System.out.println("FA");
    }
}
