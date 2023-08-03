package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Number14467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 관찻 횟수
        int count = 0;  // 길을 건넌 횟수
        HashMap<Integer, Integer> map = new HashMap<>();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());         // 소의 번호
            int position = Integer.parseInt(st.nextToken());    // 소의 위치

            if (map.containsKey(num)) {     // 기존 관찰된 소라면
                if (!map.get(num).equals(position)) {   // 위치가 바뀌면
                    count ++;
                }
            }

            map.put(num, position);     // 소의 번호와 위치를 초기화
        }

        System.out.println(count);
    }
}
