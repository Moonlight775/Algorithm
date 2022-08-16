package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number9020 {

    static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        getPrime();

        int T = Integer.parseInt(br.readLine());        // 테스트 케이스의 개수

        for (int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());    // 주어진 짝수
            // n을 반으로 나누어 front는 -1씩 해주고 back은 +1씩 해주면서 그 값이 소수가 되면 출력
            int front = n / 2;
            int back = n / 2;

            while (true) {
                if (!prime[front] && !prime[back]) {    // prime 배열의 index가 false라면 소수라는 뜻
                    sb.append(front).append(" ").append(back).append('\n');
                    break;
                }
                front--;
                back++;
            }

        }

        System.out.println(sb);
    }

    // 에라토스테네스의 체를 이용해 소수 구하기
    public static void getPrime() {
        prime[0] = prime[1] = true;

        for (int i=2; i<=Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }

            for (int j=i*i; j< prime.length; j=j+i) {
                prime[j] = true;
            }
        }
    }

}
