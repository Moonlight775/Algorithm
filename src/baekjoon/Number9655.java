package baekjoon;

import java.io.*;

public class Number9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());   // 돌 개수

        bw.write(N % 2 == 1 ? "SK" : "CY");
        bw.flush();
        bw.close();
        br.close();
    }
}