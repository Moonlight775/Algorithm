package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 강의의 수
        int M = Integer.parseInt(st.nextToken());   // 블루레이의 수
        int[] A = new int[N];
        int start = 0;
        int end = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());

            if (start < A[i]) {     // 강의 길이 최댓값을 시작 인덱스로 저장
                start = A[i];
            }

            end += A[i];    // 모든 레슨의 총합을 종료 인덱스로 저장
        }

        while (start <= end) {
            int middle = (start + end) / 2;     // 중간 인덱스
            int sum = 0;    // 강의 합
            int count = 0;  // 현재 사용한 블루레이 개수

            // middle 값으로 모든 레슨을 저장할 수 있는지 확인
            for (int i = 0; i < N; i++) {
                if (sum + A[i] > middle) {
                    count++;
                    sum = 0;
                }
                sum += A[i];
            }

            if (sum != 0) {     // 탐색 후 sum 이 0이 아니면 블루레이가 1개 더 필요하므로 더함
                count++;
            }

            if (count > M) {
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }

        System.out.println(start);
    }
}