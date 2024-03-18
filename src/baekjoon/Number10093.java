package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        if (A > B) {    // A가 B보다 크다면 쉽게 오름차순으로 출력하기 위해 A와 B 교체
            long tmp = A;
            A = B;
            B = tmp;
            sb.append(B - A - 1).append('\n');  // A와 B 사이에 있는 수의 개수
        }
        else if (A == B) {
            sb.append(0).append('\n');
        }
        else {
            sb.append(B - A - 1).append('\n');
        }

        for (long i = A + 1; i < B; i++) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}