package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number14652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 세로 길이
        int M = Integer.parseInt(st.nextToken());   // 가로 길이
        int K = Integer.parseInt(st.nextToken());   // 좌석 번호

        System.out.print(K / M + " ");  // n 좌표
        System.out.println(K % M);      // m 좌표
    }
}