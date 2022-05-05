package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Number2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());    // 수의 개수

        ArrayList<Integer> list = new ArrayList<>();    // list 계열 중 하나를 쓰면 된다.

        for (int i=0; i<N; i++) {
            list.add(Integer.parseInt(br.readLine()));  // 입력되는 수로 list 추가
        }

        Collections.sort(list); // Collections에서 제공하는 sort 사용

        for (int i : list) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}
