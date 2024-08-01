package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[101];   // 주차 시간을 담을 배열

        // 주차한 시간은 +1
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j < end; j++) {
                arr[j]++;
            }
        }

        int price = 0;  // 주차 요금

        for (int i = 1; i < 101; i++) {
            if (arr[i] == 1) {
                price += A;
            }
            else if (arr[i] == 2) {
                price += (B * 2);
            }
            else if (arr[i] == 3){
                price += (C * 3);
            }
        }

        System.out.println(price);
    }
}