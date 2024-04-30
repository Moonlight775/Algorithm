package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 수

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());    // 학교의 수

            Map<String, Integer> map = new HashMap<>(); // key: 학교, value: 소비한 술의 양

            // map 초기화
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
            }

            // map의 value 값에 대한 list
            List<Integer> list = new ArrayList<>(map.values());

            Collections.sort(list); // 오름차순 정렬

            for (String key : map.keySet()) {
                // list 정렬한 값 중 가장 큰 값 (list.get(N-1))
                if (map.get(key).equals(list.get(N - 1))) {
                    sb.append(key).append('\n');
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}