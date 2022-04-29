package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number5218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스 수

        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str1 = st.nextToken();   // 첫 번째 단어
            String str2 = st.nextToken();   // 두 번째 단어

            for (int j=0; j< str1.length(); j++) {
                int x = str1.charAt(j) - 'A';   // 문자를 int형으로 변환
                int y = str2.charAt(j) - 'A';
                int result;

                if (y >= x) {
                    result = y - x;
                } else {
                    result = (y+26) - x;
                }

                sb.append(result).append(" ");
            }
            System.out.println("Distances: " + sb);
            sb.setLength(0);    // StringBuilder 초기화
        }
    }
}
