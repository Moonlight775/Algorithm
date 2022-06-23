package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2748 {

    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr= new long[N+1];

        for (int i=0; i<N+1; i++) {
            // 배열은 디폴트 값인 0으로 초기화 되어 있는데, 비어있는 수를 체크할 때 0으로 하면
            // fibonacci(0) 의 경우 중복되기 때문에 이러한 것을 방지하기 위해 -1로 초기화해준다.
            arr[i] = -1;
        }

        arr[0] = 0;
        arr[1] = 1;
        System.out.println(fibonacci(N));
    }

    public static long fibonacci(int N) {
        if (arr[N] == -1) {
            arr[N] = fibonacci(N-1) + fibonacci(N-2);
        }
        return arr[N];
    }
}
