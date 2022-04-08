package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());   // 낮에 올라가는 높이
        int B = Integer.parseInt(st.nextToken());   // 밤에 내려가는 높이
        int V = Integer.parseInt(st.nextToken());   // 나무 막대의 높이
        int result = 0; // 움직이는 높이를 체크하기 위한 변수
        int cnt = 0;    // 며칠이 걸리는지 확인하기 위한 변수

        while(true) {
            result += A;    // 낮에 올라가는 만큼 합한다.
            cnt++;          // 날짜를 +1 해준다.
            if(result >= V) break;  // 올라간 높이가 나무 막대의 높이보다 갖거나 높으면 정상에 올라온 것이므로 while문을 종료한다.

            result -= B;    // 밤에 내려가는 만큼 빼준다.

        }
        System.out.println(cnt);
    }
}
