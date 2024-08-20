package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 케이스의 개수

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            String[] str = br.readLine().split(" ");    // String 배열에 공백을 기준으로 잘라 저장
            sb.append("Case #").append(i).append(": ");

            // 배열의 값을 역으로 출력
            for (int j = str.length - 1; j >= 0; j--) {
                sb.append(str[j]).append(" ");
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}