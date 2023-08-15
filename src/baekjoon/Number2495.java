package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            char[] num = br.readLine().toCharArray();
            int count = 0;  // 연속하여 같은 숫자 카운트
            int max = 0;    // 가장 큰 연속하는 같은 숫자

            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] == num[j + 1]) {     // 다음 수도 같은 수라면
                    count++;
                    max = Math.max(max, count);
                } else {    // 다시 카운트하기 위해 0으로 초기화
                    count = 0;
                }
            }

            if (max == 0) {
                System.out.println(1);
            } else {
                System.out.println(max + 1);
            }
        }
    }
}
