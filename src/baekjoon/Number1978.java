package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 수의 개수
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++) {
            boolean isPrime = true;     // true면 소수, 아니면 false
            int num = Integer.parseInt(st.nextToken()); // 주어지는 수

            if (num == 1) continue;     // 1은 소수가 아니다.

            /* num = AXB 라고 볼 때 1<=A,B<num> 이라는 부등식을 세울 수 있다.
             만약 A와 B가 num의 제곱근보다 커지면 위 부등식에 모순이 생간다.
             A,B>sqrt(num) -> AXB>num
             결국 AXB = num 라는 식과 모순이므로
             합성수 num=AXB에서 A와 B 중 적어도 하나는 num의 제곱근보다 작거나 같다.*/

            for (int j=2; j<=Math.sqrt(num); j++) {     // 조건 범위가 num의 제곱근까지다.
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {  // 소수라면 count 해준다.
                count++;
            }
        }

        System.out.println(count);
    }
}
