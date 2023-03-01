package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number2526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int rest = N;   // 다음 값을 구하기 위한 나머지

        ArrayList<Integer> list = new ArrayList<>();    // 서로 다른 수를 담을 리스트

        while (true) {
            rest = (rest * N) % P;

            for (int i=0; i<list.size(); i++) {
                if (rest == list.get(i)) {
                    System.out.println(list.size() - i);
                    return;
                }
            }

            list.add(rest);
        }
    }
}
