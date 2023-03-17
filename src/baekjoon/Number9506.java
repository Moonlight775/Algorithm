package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            ArrayList<Integer> list = new ArrayList<>();    // 약수 담을 리스트
            int num = Integer.parseInt(br.readLine());  // 임의의 숫자

            if (num == -1) break;   // -1이면 종료

            // 약수 구하기
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    list.add(i);
                }
            }

            int hap = 0;    // 약수 합

            // 약수들의 합 구하기
            for (int i = 0; i < list.size(); i++) {
                hap += list.get(i);
            }

            if (num == hap) {   // 완전수라면
                sb.append(num).append(" = ");

                for (int i = 0; i < list.size() - 1; i++) {
                    sb.append(list.get(i)).append(" + ");
                }
                sb.append(list.get(list.size()-1)).append('\n');
            }
            else {    // 완전수가 아니라면
                sb.append(num).append(" is NOT perfect.").append('\n');
            }
        }

        System.out.println(sb);
    }
}
