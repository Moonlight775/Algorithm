package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number13752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수
        String str = "=";

        while (n-- > 0) {
            int rep = Integer.parseInt(br.readLine());  // 반복할 횟수

            sb.append(str.repeat(rep)).append('\n');
        }

        System.out.println(sb);
    }
}