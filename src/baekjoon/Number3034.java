package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number3034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 성냥의 개수
        int W = Integer.parseInt(st.nextToken());   // 가로 크기
        int H = Integer.parseInt(st.nextToken());   // 세로 크기
        int D = (int) Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));   // 대각선 크기

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num <= D) { // 대각선 크기보다 성냥이 작으면 박스에 들어감
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
