package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Number4641 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine(); // 리스트

            StringTokenizer st = new StringTokenizer(str, " ");

            ArrayList<Integer> list = new ArrayList<>();
            int count = 0;

            // 리스트 배열 초기화
            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            if (list.get(0) == -1) break;

            Collections.sort(list);   // 순서대로 비교를 위해 정렬

            for (int i = 1; i < list.size()-1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if ((list.get(i) * 2) == list.get(j)) {
                        count++;
                        break;
                    }
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}