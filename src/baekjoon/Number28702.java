package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 문자열이 숫자라면 +3하여 네 번째 문자열로 이동,
        // 두 번째 문자열이 숫자라면 +2하여 네 번째 문자열로 이동하도록 조건 설정
        for (int i = 3; i > 0; i--) {
            String str = br.readLine();

            if (str.chars().allMatch(Character::isDigit)) { // 문자열이 숫자인지 판단
                int num = Integer.parseInt(str) + i;    // 주어지는 세 문자열 다음 문자열이 되도록

                // FizzBuzz 규칙에 따라서
                if (num % 3 == 0) {
                    if (num % 5 == 0) {
                        System.out.println("FizzBuzz");
                    }
                    else {
                        System.out.println("Fizz");
                    }
                }
                else if (num % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(num);
                }
                return;
            }
        }
    }
}