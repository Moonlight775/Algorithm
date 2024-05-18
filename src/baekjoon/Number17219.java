package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Number17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 사이트 주소의 수
        int M = Integer.parseInt(st.nextToken());   // 찾으려는 사이트의 수

        HashMap<String, String> map = new HashMap<>();

        // map에 key=사이트 주소, value=비밀번호로 초기화
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String pwd = st.nextToken();

            map.put(site, pwd);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String find = br.readLine();
            sb.append(map.get(find)).append('\n');
        }

        System.out.println(sb);
    }
}