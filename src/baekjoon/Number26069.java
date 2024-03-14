package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Number26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 사람들이 만난 기록의 수

        HashSet<String> set = new HashSet<>();  // 중복되는 이름을 방지하기 위해 HashSet 사용
        set.add("ChongChong");

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name1 = st.nextToken();
            String name2 = st.nextToken();

            // set에 저장되어 있다는 것은 총총이와 만난 이후의 사람들
            if (set.contains(name1) || set.contains(name2)) {
                set.add(name1);
                set.add(name2);
            }
        }

        System.out.println(set.size());
    }
}