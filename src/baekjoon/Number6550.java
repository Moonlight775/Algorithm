package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number6550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);

            String s = st.nextToken();
            String t = st.nextToken();
            int index = 0;  // 문자열 s의 인덱스

            for (int i = 0; i < t.length(); i++) {
                if (s.charAt(index) == t.charAt(i)) {   // s와 같은 문자가 t에 있다면 인덱스 +1하여 다음 문자 비교진행
                    index++;
                }
                if (index == s.length()) break;     // s가 t의 부분 문자열이라면 종료
            }

            if (index == s.length()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
