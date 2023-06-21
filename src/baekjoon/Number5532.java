package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());    // 방학 일 수
        int A = Integer.parseInt(br.readLine());    // 풀어야 할 국어페이지
        int B = Integer.parseInt(br.readLine());    // 풀어야 할 수학페이지
        int C = Integer.parseInt(br.readLine());    // 하루 최대 풀 수 있는 국어페이지
        int D = Integer.parseInt(br.readLine());    // 하루 최대 풀 수 있는 수학페이지

        // (풀어야 할 페이지 수 / 최대 풀 수 있는 페이지 수) + 1일(나머지 페이지를 푸는 날)
        // 이 수식이 과목별로 최대한 빠르게 풀 수 있는 날
        int language = (int) Math.ceil((double) A / C);
        int mathmatics = (int) Math.ceil((double) B / D);
        int max = Math.max(language, mathmatics);   // 국어, 수학 중 어떤 과목이 더 오래 걸리는지

        System.out.println(L - max);    // 방학 - 숙제한날 = 놀 수 있는 날
    }
}
