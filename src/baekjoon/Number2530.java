package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());   // 시
        int B = Integer.parseInt(st.nextToken());   // 분
        int C = Integer.parseInt(st.nextToken());   // 초
        int D = Integer.parseInt(br.readLine());    // 요리 하는데 필요한 시간 (초)

        C += D;         // 초 + 요리하는데 필요한 시간(초) (ex. C = 0, D = 200 -> C = 200)
        B += C / 60;    // 합산된 초를 60으로 나눠주면 분이 됨 (ex. B = 30 -> B = 30 + 200/60 = 33)
        C %= 60;        // 합산된 초에 60으로 나눈 나머지가 최종 초가 됨 (ex. C = 200 -> C = 200%60 = 20)
        A += B / 60;    // 만약 분이 60분이 넘었다면 60으로 나눠진 값이 + 시가 됨 (ex. A = 14 -> A = 14 + 33/60 = 14)
        B %= 60;        // 합산된 분에 60으로 나눈 나머지가 최종 분이 됨 (ex. B = 33 % 60 = 33)
        A %= 24;        // 24시가 오버된 경우 0부터 다시 시작하도록 (ex. A = 14 % 24 = 14)

        System.out.println(A + " " + B + " " + C);
    }
}
