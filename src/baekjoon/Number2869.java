package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double A = Integer.parseInt(st.nextToken());   // 낮에 올라가는 높이
        double B = Integer.parseInt(st.nextToken());   // 밤에 내려가는 높이
        double V = Integer.parseInt(st.nextToken());   // 나무 막대의 높이

        int X = (int)Math.ceil((V-B) / (A-B));  // 올라가는데 걸리는 일 수
        // 낮에 정상에 도착한다면 미끄러지지 않으므로 밤에 내려가는 것은 무시하면 된다.
        // 그렇기 때문에 기준을 낮으로 둔다.
        // 낮 기준으로 4일차 낮을 예로 들면 A-B+A-B+A-B+A가 된다.
        // 수식으로 바꿔본다면 X일차일 경우 (A-B)*(X-1)+A 라는 수식이 된다.
        // V = AX-A-BX+B+A -> AX-BX+B
        // V-B = AX-BX = (A-B)X
        // X = (V-B)/(A-B)
        // X의 값이 소수라면 그 소수만큼 더 가야한다는 뜻으로 올림을 해준다.

        System.out.println(X);
    }
}
