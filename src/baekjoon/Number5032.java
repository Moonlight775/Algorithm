package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number5032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int e = Integer.parseInt(st.nextToken());   // 가지고 있는 빈 병의 수
        int f = Integer.parseInt(st.nextToken());   // 발견한 빈 병의 수
        int c = Integer.parseInt(st.nextToken());   // 새 병으로 바꾸는 필요한 빈 병의 개수
        int result = (e + f) / c;       // 최대로 먹을 수 있는 탄산 음료 수
        int drink = result;             // 탐산 음료 수
        int remainder = (e + f) % c;    // 빈 병을 탄산 음료로 바꾸고 남는 빈 병 수

        while (drink > 0) {
            int sum = drink + remainder;    // 탄산 음료 마신 후 빈 병 + 기존 남은 빈병 수
            drink = sum / c;                // 최종 남은 빈 병을 탄산음료로 교환
            result += drink;                // 탄산 음료로 바꾼 만큼 result 에 추가
            remainder = sum % c;            // 탄산 음료로 바꾸는데 남은 빈 병 수
        }

        System.out.println(result);
    }
}
