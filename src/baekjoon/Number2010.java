package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 멀티탭의 수
        int cnt = 0;    // 꽂을 수 있는 플러그의 수

        for (int i=0; i<N; i++) {
            int plug = Integer.parseInt(br.readLine()); // 멀티탭의 플러그 수

            if (i != N-1) {     // 마지막 멀티탭이 아니라면

                if (plug == 1) {    // 앞의 멀티탭 혹은 전원에 연결해야 하므로 플러그의 개수에 -1을 해줘야함. 즉, 1일경우는 0임
                    cnt = 0;
                } else {
                    cnt += plug - 1;    // 앞의 멀티탭 혹은 전원에 연결해야 하므로 -1 필요
                }

            } else {
                cnt += plug;    // 마지막 멀티탭은 모든 플러그를 사용 가능
            }
        }
        System.out.println(cnt);
    }
}
