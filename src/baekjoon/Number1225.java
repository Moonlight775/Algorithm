package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // A와 B의 수를 각자 char 배열에 담음
        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();

        long sumOfA = 0; // A의 모든 자리 수의 합
        long sumOfB = 0; // B의 모든 자리 수의 합

        for (char c : A) {
            sumOfA += c - '0';
        }

        for (char c : B) {
            sumOfB += c - '0';
        }

        // A와 B의 각자 자리 수의 합을 곱하면 각각 곱할 필요 없이 곱셈 결과가 나옴
        System.out.println(sumOfA * sumOfB);
    }
}
