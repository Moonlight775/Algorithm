package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Number1233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();    // 주사위 눈의 합을 담을 리스트

        // 리스트 초기화
        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    list.add(i + j + k);
                }
            }
        }

        Collections.sort(list); // 중복된 값을 모아서 비교하기 위해 정렬

        int index = 0;  // 가장 많이 중복되는 값의 인덱스
        int max = 0;    // 최대 중복되는 개수
        int count = 0;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {   // 최대 중복되는 값 찾기
                count++;
                if (max < count) {
                    max = count;
                    index = i;
                }
            } else {
                count = 0;
            }
        }

        System.out.println(list.get(index));
    }
}
