package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 삼각형의 각
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        // 세 각의 합이 180이 아닌 경우
        if (A + B + C != 180) {
            System.out.println("Error");
        } else {
            // 세 각의 크기가 모두 60이면
            if (A == 60 && B == 60 && C == 60) {
                System.out.println("Equilateral");
            }
            // 세 각의 합이 180이고, 두 각이 같은 경우
            else if (A == B || A == C || B == C) {
                System.out.println("Isosceles");
            }
            // 세 각의 합이 180이고, 같은 각이 없는 경우
            else {
                System.out.println("Scalene");
            }
        }
    }
}