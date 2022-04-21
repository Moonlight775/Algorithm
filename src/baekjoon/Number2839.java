package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 4 || N == 7) {                 // 4, 7은 정확히 나눌 수 없다.
            System.out.println(-1);
        }
        else if (N % 5 == 0) {                  // 5의 배수라면
            System.out.println(N / 5);          // N을 5로 나눈 값이다.
        }
        else if (N % 5 == 1 || N % 5 == 3) {    // N이 5의 배수+1, +3이라면
            System.out.println((N / 5) + 1);
        }
        else if (N % 5 == 2 || N % 5 == 4) {    // N이 5의 배수+2, +4라면
            System.out.println((N / 5) + 2);
        }

        // 표로 정리해보면 규칙성을 발견할 수 있다.
    }
}
