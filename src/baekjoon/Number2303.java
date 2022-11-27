package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Number2303 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 사람의 수

        int[] arr = new int[5];     // 다섯장의 카드를 담을 배열
        ArrayList<Integer> list = new ArrayList<>();    // 일의 자리 최댓값을 담을 리스트

        while (N-- > 0) {
            int max = 0;    // 일의 자리 최댓값

            // 배열 초기화
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i=0; i<5; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            // 일의 자리 최댓값 찾기
            for (int i=0; i<3; i++) {
                for (int j=i+1; j<4; j++) {
                    for (int k=j+1; k<5; k++) {
                        max = Math.max(max, (arr[i] + arr[j] + arr[k]) % 10);
                    }
                }
            }

            list.add(max);  // 최댓값을 리스트에 추가
        }

        int resultMax = Collections.max(list);  // 리스트에서 최댓값

        // 이긴 사람이 여러명일 경우 번호가 가장 큰 사람을 출력해야 하므로 i는 리스트의 역순으로 진행
        for (int i=list.size()-1; i>=0; i--) {
            // 최댓값이랑 같은 값이라면 출력
            if (resultMax == list.get(i)) {
                System.out.println(i+1);
                return;
            }
        }
    }
}
