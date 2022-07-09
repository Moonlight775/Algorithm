package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long S = Long.parseLong(br.readLine());
        long count = 1;

        while (S >=0) {     // 자연수 합이 0보다 작아질 때까지
            S = S - count;  // 서로 다른 N개의 자연수이므로 count 값을 1씩 증가하며 빼준다.
            if (S < 0) {
                System.out.println(count-1);
            }
            count++;
        }
    }
}
