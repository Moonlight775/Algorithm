package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1904 {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N+1];

        System.out.println(getTile(N));
    }

    static int getTile(int N) {
        if (arr[N] != 0) {
            return arr[N];
        }

        if (N <= 2) {
            return N;
        }
        else if (N > 2) {
            return arr[N] = (getTile(N-1) + getTile(N-2)) % 15746;   // 피보나치 수와 같은 점화식을 갖는다. 나열해보면 규칙을 알 수 있다.
        }
        else {
            return N;
        }
    }

}
