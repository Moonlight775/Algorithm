package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number25640 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String mine = br.readLine();    // 진호의 MBTI 유형
        int N = Integer.parseInt(br.readLine());    // 친구의 수
        int count = 0;  // 진호와 MBTI 유형이 같은 사람의 수

        while (N-- > 0) {
            if (mine.equals(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}