package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number2331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());   // D[1]
        int P = Integer.parseInt(st.nextToken());   // 곱하는 횟수

        ArrayList<Integer> list = new ArrayList<>();    // 수열 리스트
        list.add(A);    // D[1] 초기화

        while (true) {
            int num = list.get(list.size()-1);  // 수열의 수
            int next = 0;   // 다음 항의 수

            while (num != 0) {
                int rest = num % 10;    // 수의 일의 항
                next += (int) Math.pow(rest, P);    // 일의 항의 거듭제곱의 합
                num /= 10;
            }

            // 리스트에 이미 있는 값이 있다면
            if (list.contains(next)) {
                int result = list.indexOf(next);    // 이미 포함되어 있는 값의 인덱스 위치
                System.out.println(result);
                break;
            }

            list.add(next);
        }

    }
}
