package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number2204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());    // 테스트케이스의 수
            if (n == 0) break;

            String[] str = new String[n];   // 대소문 구분 없는 단어 배열
            String[] temp = new String[n];  // 소문자로 변환한 단어 배열

            // 배열 초기화
            for (int i = 0; i < n; i++) {
                str[i] = br.readLine();
                temp[i] = str[i].toLowerCase();
            }

            Arrays.sort(temp);  // 사전순 정렬

            int num = 0;

            for (int i = 0; i < n; i++) {
                // 사전순으로 가장 앞서는 단어가 단어 배열에서 몇 번째 위치하는지 확인
                if (temp[0].equals(str[i].toLowerCase())) {
                    num = i;
                    break;
                }
            }

            sb.append(str[num]).append('\n');
        }

        System.out.println(sb);
    }
}
