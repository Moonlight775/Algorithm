package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[N+1];

        prime[0] = prime[1] = true;     // true : 소수아님, false : 소수

        for (int i=2; i<=Math.sqrt(N); i++) {   // N의 소수를 구할 때 약수는 √N과 작거나 같으므로 조건을 √N까지 해준다.
            if (prime[i]) {             // 이미 체크된 배열이면 다음으로 스킵
                continue;
            }
            for (int j=i*i; j< prime.length; j=j+i) {   // i 배수를 모두 true로 초기화, 배수가 있다는 것은 소수가 아니라는 것
                prime[j] = true;
            }
        }

        for (int i=M; i<=N; i++) {
            if (!prime[i]) {
                list.add(i);    // 소수만 list에 담는다.
            }
        }

        int sum = 0;

        for (int i : list) {
            sum += i;
            if (list.get(0) == i) {
                sum = i;
            }
        }

        if (list.isEmpty()) {   // 리스트가 비어잇다면
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
