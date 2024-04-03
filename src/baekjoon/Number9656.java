package baekjoon;

import java.io.*;

public class Number9656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());    // 돌의 개수

        bw.write(N % 2 == 0 ? "SK" : "CY");
        bw.flush();
        bw.close();
        br.close();
    }
}