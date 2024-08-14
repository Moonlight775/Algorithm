package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number14720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 우유 가게의 수
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;      // 마실 수 있는 우유의 최대 개수
        int current = 0;    // 현재 우유 가게

        for (int i : arr) {
            if (i == current) {    // 마실 수 있는 우유가게인지 판단
                count++;
                current = (current + 1) % 3;    // 2 다음이 0이 되도록 %3 해준다.
            }
        }

        System.out.println(count);
    }
}