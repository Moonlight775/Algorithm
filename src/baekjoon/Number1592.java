package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 사람 수
        int M = Integer.parseInt(st.nextToken());   // 공 받는 수
        int L = Integer.parseInt(st.nextToken());
        int count = 0;  // 공 던진 횟수

        int[] person = new int[N+1];    // 사람 배열

        // 1번 자리에서 시작
        person[1]++;
        int grab = 1;

        while (person[grab] != M) {
            // 공을 받은 횟수가 홀수 또는 0이라면
            if (person[grab] % 2 != 0 || person[grab] == 0) {
                grab += L;  // 시계 방향으로 L번째 이동
                // 원형이므로 N번이 넘으면 1번부터 다시 센다
                if (grab > N) {
                    grab %= N;
                }
                // 공을 받은 횟수가 짝수라면
            } else {
                grab -= L;  // 반시계 방향으로 L번째 이동
                // 원형이므로 이동 후 0보다 작거나 같으면 N번부터 다시 센다
                if (grab <= 0) {
                    grab += N;
                }
            }
            person[grab]++;
            count++;

        }

        System.out.println(count);
    }
}