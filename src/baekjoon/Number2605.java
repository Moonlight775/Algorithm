package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Number2605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 학생의 수

        LinkedList<Integer> list = new LinkedList<>();  // 학생들이 줄을 선 순서를 담을 리스트

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());     // 뽑은 번호

            // (i-num) 으로 학생들이 추가될 위치를 설정
            list.add((i-num), i+1);
        }

        for (int val : list) {
            System.out.print(val + " ");
        }
    }
}
