package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 입력받은 방

        int cnt = 1;    // 1번부터 지나가는 개수
        int start = 0;  // 시작 범위의 수
        int last = 1;   // 마지막 범위의 수
        int line = 6;

        while(true) {
            if(N==1) break;     // 1일때는 1개를 지나가므로 반복문 탈출

            start = last + 1;   // 1 이후부터의 시작 범위의 수
            last = last + line; // 1 이후부터의 마지막 범위의 수
            cnt++;
            if(start <= N && N <= last) break;  // 어느 범위에 속하는지 알기 위한 조건
            line = line + 6;    // 6씩 증가하는 등차수열 이므로
        }
        // 몇 개를 지나가는지를 알아보기 위해서 규칙을 살펴본다.
        // 1-1개, (2~7)-2개, (8~19)-3개, (20~37)-4개, ...
        // 괄호안의 범위를 본다면 6, 12, 18, 24,... 6씩 증가하는 등차수열로 되어 있다.
        // 해당규칙을 풀어서 작성한다면 답을 구할 수 있다.
        System.out.println(cnt);
    }
}
