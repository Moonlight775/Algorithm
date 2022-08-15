package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number4948 {

    static StringBuilder sb = new StringBuilder();
    static boolean[] prime;
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());    // 입력된 자연수

            if (n == 1) {
                sb.append(1).append('\n');
            }
            else if (n == 0) {
                break;
            }
            else {
                betrand(n);
            }

        }

        System.out.println(sb);

    }

    public static void betrand(int num) {
        int two = num * 2;      // 2n을 two라고 지정

        list = new ArrayList<>();   // 각 값마다 새로운 리스트의 사이즈를 구하기 위해서 새로운 리스트 생성
        prime = new boolean[two+1]; // 2n까지 소수를 찾으면 되므로 배열 사이즈를 2n으로
        prime[0] = prime[1] = true; // true는 소수아님, false는 소수

        for (int i=2; i<=Math.sqrt(two); i++) { // 약수 중 하나는 √2n보다 작거나 같으므로 조건범위를 줄인다.
            if (prime[i]) {     // 이미 체크된 배열은 스킵
                continue;
            }

            for (int j=i*i; j<=two; j=j+i) {    // i 배수를 모두 true로 초기화, 배수가 있다는 것은 소수가 아니다.
                prime[j] = true;
            }
        }

        for (int i=num+1; i<=two; i++) {    // n보다 크고 2n보다 작거나 같은 수의 범위
            if (!prime[i]) {    // false면 소수
                list.add(i);    // 리스트에 추가
            }
        }

        sb.append(list.size()).append('\n');    // 리스트의 크기는 소수의 개수와 같으므로 출력

    }
}
