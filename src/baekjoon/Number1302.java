package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 책의 개수

        HashMap<String, Integer> map = new HashMap<>();

        for (int i=0; i<N; i++) {
            String str = br.readLine();
            int num = 1;

            // 같은 이름의 책이 존재한다면
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);     // value에 +1
            }
            else {
                map.put(str, num);
            }
        }

        int max = 0;

        // 가장 많이 팔린 책의 수 = max
        for (int val : map.values()) {
            if (val > max) {
                max = val;
            }
        }

        // 책 이름을 담을 리스트
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);     // 사전순으로 정렬

        for (String val : list) {
            // 가장 많이 팔린 책을 출력
            if (map.get(val) == max) {
                System.out.println(val);
                break;
            }
        }

    }
}
