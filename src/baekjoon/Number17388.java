package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number17388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];     // 각 대학의 참여도

        // 참여도 초기화
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        if (arr[0] + arr[1] + arr[2] >= 100) {
            System.out.println("OK");
        } else {
            if (min == arr[0]) {
                System.out.println("Soongsil");
            } else if (min == arr[1]) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}