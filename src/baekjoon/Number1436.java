package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());        // N번째 영화

        int num = 666;
        int cnt = 1;

        while (cnt != N) {      // cnt가 N이 될때까지
            num++;              // 666에서 계속 증가 시켜준다.

            if (String.valueOf(num).contains("666")) {  // 666이 포함된 숫자들이 순차적으로 적용
                cnt++;
            }
        }

        System.out.println(num);
    }
}
