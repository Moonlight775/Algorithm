package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Number11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 카드의 개수
        int max = 0;    // 가장 많은 숫자 카드 개수
        long x = 0;     // 가장 많이 가지고 있는 정수

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1); // map 초기화

            if (map.get(num) > max) {   // 입력된 정수의 카드 개수가 max 보다 많을 때
                max = map.get(num);
                x = num;
            }
            else if (map.get(num) == max) { // 가장 많이 가지고 있는 정수가 여러 가지라면
                x = Math.min(x, num);       // 작은 값을 x에 저장
            }
        }

        System.out.println(x);
    }
}