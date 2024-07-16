package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String A = st.nextToken();
        String B = st.nextToken();
        String C_A;    // A값의 5, 6을 변경한 값
        String C_B;    // B값의 5, 6을 변경한 값

        // 최솟값 만들기 (6을 5로 변경)
        C_A = A.replaceAll("6", "5");
        C_B = B.replaceAll("6", "5");
        int sum = Integer.parseInt(C_A) + Integer.parseInt(C_B);
        sb.append(sum).append(" ");

        // 최댓값 만들기 (5를 6으로 변경)
        C_A = A.replaceAll("5", "6");
        C_B = B.replaceAll("5", "6");
        sum = Integer.parseInt(C_A) + Integer.parseInt(C_B);
        sb.append(sum);

        System.out.println(sb);
    }
}