package baekjoon;

import java.util.Scanner;

public class Number3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();   // 반지름

        System.out.println(Math.PI * R * R);        // 유클리드 기하학 원의 넓이 공식 (𝜋𝑟²)
        System.out.println((double) 2 * R * R);     // 택시 기하학의 원의 넓이 공식 (2𝑟²)
    }
}
