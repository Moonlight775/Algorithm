package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[31];    // 30명을 담을 배열

        for (int i=0; i<28; i++) {  // 28명이 제출하므로 조건범위를 i<28로 설정
            int index = Integer.parseInt(br.readLine());
            arr[index] = 1;         // 제출자의 출석번호는 1로 초기화
        }

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<31; i++) {
            if (arr[i] == 0) {      // 0 이라면 미제출자이므로
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}
