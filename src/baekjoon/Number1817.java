package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 책의 개수
        int M = Integer.parseInt(st.nextToken());   // 박스에 넣을 수 있는 최대 무게
        int[] book = new int[N];    // 책 배열
        int count = 0;      // 필요한 박스의 개수

        if (N == 0) {   // 책의 개수가 0이면 바로 0 출력
            System.out.println(0);
            return;
        }

        // 책 배열 초기화
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            book[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;    // 책의 무게 합

        for (int i = 0; i < N; i++) {
            sum += book[i];

            if (sum > M) {
                count++;
                sum = book[i];
            }
        }

        System.out.println(count + 1);
    }
}