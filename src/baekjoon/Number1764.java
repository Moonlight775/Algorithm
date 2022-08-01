package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hs = new HashSet<>();   // 검색속도를 위해 HashSet사용

        for (int i=0; i<N; i++) {
            hs.add(br.readLine());
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<M; i++) {
            String str = br.readLine();
            if (hs.contains(str)) {     // 중복된다면 리스트에 추가 (사이즈 출력을 위해)
                list.add(str);
            }
        }

        Collections.sort(list);     // 사전순으로 정렬

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append('\n');

        for (String value : list) {
            sb.append(value).append('\n');
        }

        System.out.println(sb);
    }
}
