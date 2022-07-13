package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        // StringTokenizer클래스는 특정 문자로 문자열을 분리가 가능하다.
        StringTokenizer st0 = new StringTokenizer(S, "0");  // 0을 뒤집은 횟수
        StringTokenizer st1 = new StringTokenizer(S, "1");  // 1을 뒤집은 횟수

        System.out.println(Math.min(st0.countTokens(), st1.countTokens())); // 최소 횟수 출력
    }
}