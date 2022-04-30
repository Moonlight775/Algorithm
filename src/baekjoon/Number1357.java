package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        System.out.println(Rev(Rev(X) + Rev(Y)));
    }

    public static int Rev(int num) {
        int result = 0;

        while (num != 0) {
            result = result*10 + num%10;    // ex) 12 -> num%10 = 2 -> result = 2 -> num%10 = 1 -> result = 2*10+1 = 21
            num /= 10;  // 일의 자리가 변하도록 num을 10으로 계속 나눠주고, 0이 되면 while문이 종료된다.
        }

        return result;
    }
}