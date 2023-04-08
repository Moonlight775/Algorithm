package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 여학생의 수
        int M = Integer.parseInt(st.nextToken());   // 남학생의 수
        int K = Integer.parseInt(st.nextToken());   // 인턴쉽에 참여해야하는 인원
        int count = 0;

        // 여자 2명 이상이고 남자 1명 이상, 남자+여자 합이 한 팀 이상 될 수 있다면
        while (N >= 2 && M >= 1 && M + N >= 3 + K) {
            N -= 2;
            M--;
            count++;
        }

        System.out.println(count);
    }
}