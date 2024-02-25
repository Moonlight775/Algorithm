package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Number7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 출입 기록의 수

        HashMap<String, String> map = new HashMap<>();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();   // 이름
            String state = st.nextToken();  // 출근 or 퇴근 상태

            if (map.containsKey(name)) {    // map에 데이터가 있다는 것은 출근하고 퇴근할때라는 뜻
                map.remove(name);
            }
            else {  // map에 데이터가 없으면 출근이므로 map에 추가
                map.put(name, state);
            }
        }

        // 내림차순을 위한 map의 key list 생성
        ArrayList<String> keySet = new ArrayList<>(map.keySet());

        keySet.sort(Collections.reverseOrder());    // 내림차순 정렬

        for (String key : keySet) {
            System.out.println(key);
        }
    }
}