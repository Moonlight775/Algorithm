package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        int max = 0;    // 가장 긴 문자열

        // 리스트 초기화 및 최대 길이 문자열 찾기
        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
            max = Math.max(max, list.get(i).length());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            // 다 출력한 리스트는 제거
            for (int k = 0; k < list.size(); k++) {
                if (i == list.get(k).length()) {
                    list.remove(k);
                }
            }

            for (String s : list) {
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb);
    }
}