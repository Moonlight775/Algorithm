package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Number10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        int[] T = new int[45];     // 삼각수 배열 (T_45 부터는 1000이 넘으므로 44까지)

        // 삼각수 배열 초기화
        for (int i = 1; i < T.length; i++) {
            T[i] = i * (i + 1) / 2;
        }

        HashSet<Integer> eureka = new HashSet<>();  // 유레카 이론에 맞는 수의 집합

        // HashSet 초기화
        for (int i = 1; i < 45; i++) {
            for (int j = 1; j < 45; j++) {
                for (int k = 1; k < 45; k++) {
                    eureka.add(T[i] + T[j] + T[k]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());  // 자연수
            if (eureka.contains(num)) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }

        System.out.println(sb);
    }
}
