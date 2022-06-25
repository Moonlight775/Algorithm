package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 통화한 수
        int Y = 0;  // 영식 요금제
        int M = 0;  // 민식 요금제


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            int time = Integer.parseInt(st.nextToken());    // 통화 시간

            Y += ((time / 30)+1) * 10;  // 30초마다 10원이 청구 되므로 통화시간에 나누기 30을 하는데, 30초 미만의 경우 1로 만들어 줘야 하기 때문에 +1을 해준다.
            M += ((time / 60)+1) * 15;
        }

        StringBuilder sb = new StringBuilder();
        if (Y == M) {
            sb.append("Y ").append("M ").append(Y);
        }
        else if (Y > M) {   // 영식 요금제가 더 높다면 더 저렴한 민식 요금제를 출력
            sb.append("M ").append(M);
        }
        else {
            sb.append("Y ").append(Y);
        }

        System.out.println(sb);
    }
}
