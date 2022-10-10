package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1969 {

    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // DNA의 수
        int M = Integer.parseInt(st.nextToken());   // 문자열의 길이

        char[][] charArray = new char[N][M];

        // char 2차원 배열 초기화
        for (int i=0; i<N; i++) {
            String s = br.readLine();

            for (int j=0; j<M; j++) {
                charArray[i][j] = s.charAt(j);
            }
        }

        int count = 0;  // Hamming Distance의 합

        StringBuilder sb = new StringBuilder();
        for (int j=0; j<M; j++) {
            int[] alphabet = new int[26];   // 가장 많은 문자를 찾기 위한 배열

            // 각 열마다 비교, 알파벳 배열에 해당 알파벳 index +1
            for (int i=0; i<N; i++) {
                alphabet[charArray[i][j] - 'A']++;
            }

            // 제일 많은 글자가 몇 개 인지
            int max = 0;
            for (int k=0; k<26; k++) {
                max = Math.max(max, alphabet[k]);
            }

            // 제일 많은 글자를 출력
            for (int t=0; t<26; t++) {
                if (max == alphabet[t]) {
                    sb.append((char)('A'+t));
                    break;
                }
            }

            // 가장 많은 글자와 다른 글자의 개수 누적합
            count += N - max;
        }

        System.out.println(sb);
        System.out.println(count);

    }
}
