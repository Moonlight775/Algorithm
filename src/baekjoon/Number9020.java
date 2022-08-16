package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] prime = new boolean[10001];
        prime[0] = prime[1] = true;

        for (int i=2; i< prime.length; i++) {
            if (prime[i]) {
                continue;
            }

            for (int j=i*i; j<prime.length; j=j+i) {
                prime[j] = true;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=2; i< prime.length; i++) {
            if (!prime[i]) {
                list.add(i);
            }
        }

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());

            for (int j=0; j<n-3; j++) {
                for (int k=0; k<n-2; k++) {
                    if (n == list.get(j) + list.get(k)) {
                        sb.append(list.get(j)).append(" ").append(list.get(k)).append('\n');
                        break;
                    }
                }
            }

        }

        System.out.println(sb);

    }
}
