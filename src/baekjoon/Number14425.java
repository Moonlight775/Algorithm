package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Number14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 집합 S 문자열 개수
        int M = Integer.parseInt(st.nextToken());   // 집합 S에 포함되었는지 검사할 문자열 개수

        HashSet<String> hs = new HashSet<>();       // 집합 S를 담을 Set

        for (int i=0; i<N; i++) {
            hs.add(br.readLine());      // 입력된 문자열을 추가
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i=0; i<M; i++) {
            String str = br.readLine();
            if (hs.contains(str)) {     // 집합 S에 있는 문자열이라면
                list.add(str);          // 리스트에 추가
            }
        }

        System.out.println(list.size());
    }
}
