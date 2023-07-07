package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2386 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            char key = st.nextToken().charAt(0);    // 알파벳
            if (key == '#') break;
            StringBuilder str = new StringBuilder();    // 영어 문장 (소문자로 변환)

            while (st.hasMoreTokens()) {    // 영어 문장이 띄어쓰기도 포함해서 존재하므로 모두 입력받기 위해서
                str.append(st.nextToken().toLowerCase());
            }

            int cnt = checkMatch(key, str.toString());

            sb.append(key).append(" ").append(cnt).append('\n');
        }

        System.out.println(sb);
    }

    // 알파벳이 문장에서 몇 번 나타나는지 찾는 메서드
    public static int checkMatch(char key, String str) {
        int count = 0;      // 문장에 나타나는 횟수

        for (int i = 0; i < str.length(); i++) {
            if (key == str.charAt(i)) {     // 같은 알파벳이라면 카운트
                count++;
            }
        }

        return count;
    }
}
