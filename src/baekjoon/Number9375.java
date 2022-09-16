package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Number9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());    // 테스트 케이스 개수

        while (T-- > 0) {
            HashMap<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());    // 의상의 수

            for (int i=0; i<n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                st.nextToken();     // 의상의 이름은 필요X
                String kind = st.nextToken();   // 의상의 종류

                if (map.containsKey(kind)) {    // 같은 종류가 2개 이상일 경우 (ex. headwear가 2개면 value는 2가 됨)
                    map.put(kind, map.get(kind)+1);     // value +1씩 해준다.
                }
                else {  // 의상 종류가 1개일 때나 첫 번째로 입력되 었을 때
                    map.put(kind, 1);
                }
            }

            int count = 1;

            // values() : map의 value 목록을 Collection 형태로 리턴
            // 같은 의상 종류는 겹쳐 입을 수 없음, 같은 종류가 n개 있다면 그 중 1개를 선택, 즉 nC1
            // 안 입는 경우를 포함 해야 하므로 종류에 +1
            // 의상 종류가 2개고 같은 종류의 개수가 n, k개 라면
            // 조합 공식은 nC1 X kC1 와 같다.
            // count = count * nC1(즉 n, 종류별 개수)+1
            for (int value : map.values()) {
                count *= value + 1;
            }

            // 모두 안 입는 경우는 제외 해야 하므로 -1을 해줌
            sb.append(count-1).append('\n');
        }

        System.out.println(sb);
    }
}
