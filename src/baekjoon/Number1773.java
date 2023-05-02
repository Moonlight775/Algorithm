package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Number1773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 학생의 수
        int C = Integer.parseInt(st.nextToken());   // 폭죽쇼가 끝나는 시간

        HashSet<Integer> set = new HashSet<>();     // 같은 시간에 중복으로 터지는 폭죽을 제외하기 위해 Set 사용

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            int repeat = 1; // 곱하기

            // C시간 전까지 터지는 폭죽을 Set 에 추가
            while (num*repeat <= C) {
                set.add(num * repeat);
                repeat++;
            }
        }

        System.out.println(set.size());
    }
}
