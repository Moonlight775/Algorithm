package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number10156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());   // 과자 한 개의 가격
        int N = Integer.parseInt(st.nextToken());   // 사려고 하는 과자의 개수
        int M = Integer.parseInt(st.nextToken());   // 현재 가진 돈

        int result = (K * N) - M;   // 총 과자 구매 금액 - 가진 돈

        // 가진돈이 더 커서 음수라면 필요한 돈은 0
        // 양수라면 그 만큼의 돈이 부모님께 받아야 하는 금액
        System.out.println(Math.max(result, 0));
    }
}