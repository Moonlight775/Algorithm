package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = 0; // 생성자 값을 담기 위한 변수

        for (int i=0; i<N; i++) {
            int num = i;
            int sum = 0;    // 각 자릿수의 합 변수

            while (num != 0) {
                sum += num%10;    // 각 자릿수 합
                num /= 10;      // 두 자리 수 이상일 경우 다음 자릿수를 구하기 위해서 /10을 해준다
            }

            if (i+sum == N) {   // 0부터 값이 시작하므로 가장 작은 생성자가 구해지면 끝나도록 한다.
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
