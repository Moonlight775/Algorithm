package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number25628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());   // 빵의 개수
        int B = Integer.parseInt(st.nextToken());   // 패티의 개수

        // 빵의 개수 / 2 보다 패티의 개수가 더 적다면 패티의 개수만큼 만들 수 있으므로 더 적은 값이 기준이 된다.
        System.out.println(Math.min(A / 2, B));
    }
}