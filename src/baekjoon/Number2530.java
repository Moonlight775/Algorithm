package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Number2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());   // 시
        int B = Integer.parseInt(st.nextToken());   // 분
        int C = Integer.parseInt(st.nextToken());   // 초
        int D = Integer.parseInt(br.readLine());    // 요리 하는데 필요한 시간 (초)

        LocalTime localTime  = LocalTime.of(A, B, C);   // 입력된 시, 분, 초로 설정

        localTime = localTime.plusSeconds(D);   // plusSeconds()메소드로 요리 하는데 필요한 초를 더해준다.

        System.out.println(localTime.getHour() + " " + localTime.getMinute() + " " + localTime.getSecond());
    }
}
