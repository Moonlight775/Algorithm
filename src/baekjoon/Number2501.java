package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=1; i<=N; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }

        if (list.size() >= K) {
            System.out.println(list.get(K-1));  // list는 0부터 시작하므로 K번째를 구하기 위해서는 -1을 해준다.
        }
        else {
            System.out.println(0);
        }
    }
}
