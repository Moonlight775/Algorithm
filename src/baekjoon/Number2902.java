package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");   // 하이픈을 구분자로 분리
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {    // 토근이 없을 때까지 반복
            sb.append(st.nextToken().charAt(0));    // 첫 번째 글자만 저장
        }

        System.out.println(sb);
    }
}