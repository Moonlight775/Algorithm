package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number9933 {

    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 단어의 수
        String[] arr = new String[N];   // 단어 배열

        // 배열 초기화
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        check(arr, N);

        System.out.println(result);
    }

    // 뒤집어진 문자열이 같은지 확인하는 메서드
    static void check(String[] arr, int N) {
        for (int i = 0; i < N - 1; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            String rev_sb = sb.reverse().toString();

            // 문자열 자체가 뒤집어도 같은 문자열이라면
            if (arr[i].equals(rev_sb)) {
                checkReverse(sb);
                return;
            }

            for (int j = 1; j < N; j++) {
                StringBuilder comp = new StringBuilder(arr[j]);
                String rev = comp.reverse().toString();

                // 뒤집어진 문자열을 비교하여 같을 경우
                if (arr[i].equals(rev)) {
                    checkReverse(sb);
                    return;
                }
            }
        }
    }

    // 조건에 맞을 경우 출력을 위한 메서드
    static void checkReverse(StringBuilder sb) {
        int half = sb.length() / 2;
        result.append(sb.length()).append(" ").append(sb.charAt(half));
    }
}
