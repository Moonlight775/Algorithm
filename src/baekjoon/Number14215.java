package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] stick = new int[3];   // 세 막대기를 담을 배열

        for (int i = 0; i < 3; i++) {
            stick[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(stick); // 제일 긴 막대를 찾기 위해 정렬

        int a = stick[0];
        int b = stick[1];
        int c = stick[2];   // 제일 긴 막대

        // 삼각형이 되려면 가장 긴 변이 나머지 두 변의 합보다 작아야함
        if (a + b > c) {
            System.out.println(a + b + c);
        }
        // 삼각형 조건에 맞지 않다면 c(가장 긴 변)를 줄여야 한다.
        // 가장 큰 둘레를 만들기 위해서는 c가 a+b보다 1 작으면 된다.
        // 즉, a+b+c(삼각형 둘레) = a+b+(a+b-1) = (a+b)*2 -1
        else {
            System.out.println((a+b)*2 -1);
        }
    }
}