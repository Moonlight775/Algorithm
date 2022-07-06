package test;

import java.util.Scanner;

public class Prime_Eratosthenes {
    public static boolean[] prime;  // 소수를 체크할 배열

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        make_prime(N);

        for (int i=0; i< prime.length; i++) {
            if (prime[i] == false) {    // 소수일 경우 (false)
                System.out.println(i);
            }
        }
    }

    // N 이하 소수 생성 메서드
    public static void make_prime(int N) {
        prime = new boolean[N+1];

        // 소수가 아닌 index = true, 소수인 index = false

        if (N < 2) {    // 2 미만의 N을 입력받으면 소수는 판별할 필요 없으므로 return
            return;
        }

        prime[0] = prime[1] = true;     // 0과 1은 소수가 아님

        for (int i=2; i<=Math.sqrt(N); i++) {

            if (prime[i]) {     // 이미 체크되어 true라면 다음 반복문으로
                continue;
            }

            for (int j=i*i; j< prime.length; j=j+i) {   // i의 배수들을 true로 전환 (배수들은 소수가 아니므로 걸러준다.)
                prime[j] = true;
            }
        }

    }
}
