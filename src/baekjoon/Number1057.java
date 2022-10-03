package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        st.nextToken();   // 참가자의 수는 사용 X
        int kim = Integer.parseInt(st.nextToken());     // 김지민의 번호
        int lim = Integer.parseInt(st.nextToken());     // 임한수의 번호
        int count = 0;

        // 둘의 번호가 같아질때가 대결하는 경우
        while (kim != lim) {
            // 다음 라운드에서 새로 번호를 받는데, 새 번호는 본인 번호/2 + 본인 번호%2와 같다.
            kim = kim/2 + kim%2;
            lim = lim/2 + lim%2;
            count++;
        }

        System.out.println(count);
    }
}
