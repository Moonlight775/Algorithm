package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        N = (N/100)*100;    // N의 뒤 2자리를 00으로 바꿔준다.

        while (N%F != 0) {  // N이 F로 나누어지면 스탑
            N++;
        }

        N = N%100;          // 마지막 두 자리만 남도록 잘라준다.

        if (N < 10) {       // 10보다 작으면 앞에 0 붙여주어 두 글자로 출력
            System.out.println("0" + N);
        }
        else {
            System.out.println(N);
        }
    }
}
