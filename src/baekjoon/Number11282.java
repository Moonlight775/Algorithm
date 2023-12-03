package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number11282 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 주어진 N과 아스키코드와의 차이는 44031
        // 문자로 출력을 위해 char 형으로 변환
        System.out.println((char)(N+44031));
    }
}