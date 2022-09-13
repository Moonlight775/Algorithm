package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[][] sum = new int[str.length()][26];

        // 이중 for문의 i값이 1부터 시작해야 하므로 첫 번째 문자는 따로 초기화
        sum[0][str.charAt(0) - 'a']++;

        for (int i=1; i<str.length(); i++) {
            int idx = str.charAt(i) - 'a';  // 해당 알파벳의 index 수 찾기

            // 알파벳 개수를 누적해주기 위해서 이전 index 값으로 덮음
            for (int j=0; j<26; j++) {
                sum[i][j] = sum[i-1][j];
            }

            sum[i][idx]++;
        }

        int q = Integer.parseInt(br.readLine());    // 질문의 수

        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            char a = st.nextToken().charAt(0);  // 구하고자 하는 알파벳
            int l = Integer.parseInt(st.nextToken());   // 시작 문자
            int r = Integer.parseInt(st.nextToken());   // 끝 문자

            // 시작이 0번째부터 시작이면 r번째 문자까지의 index값을 출력
            if (l == 0) {
                sb.append(sum[r][a-'a']).append('\n');
            }
            else {
                sb.append(sum[r][a -'a'] - sum[l-1][a-'a']).append('\n');   // (r-l) 이 아닌 (r-l-1)
            }

        }

        System.out.println(sb);
    }
}
