package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());   // DNA 문자열 길이
        int P = Integer.parseInt(st.nextToken());   // 비밀번호로 사용할 부분문자열의 길이
        int result = 0;                             // 만들 수 있는 비밀번호의 종류의 수
        char[] str = br.readLine().toCharArray();   // DNA 문자열 배열
        int[] checkArr = new int[4];                // 비밀번호 체크 배열 (부분문자열에 포함되어야 할 'A', 'C', 'G', 'T'의 개수)

        // 비밀번호 체크 배열 초기화
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i <= str.length - P; i++) {     // P에 따른 확인해야할 범위는 (DNA 문자열 길이 - P의 길이)
            int[] currentArr = new int[4];  // 현재 부분문자열 상태 배열
            boolean flag = true;            // 부분문자열이 조건에 만족하지 못 하면 false

            // 확인중인 부분문자열 배열 초기화
            for (int j = i; j < i + P; j++) {
                if (str[j] == 'A') {
                    currentArr[0]++;
                } else if (str[j] == 'C') {
                    currentArr[1]++;
                } else if (str[j] == 'G') {
                    currentArr[2]++;
                } else if (str[j] == 'T') {
                    currentArr[3]++;
                }
            }

            for (int k = 0; k < 4; k++) {
                if (checkArr[k] > currentArr[k]) {  // 조건에 충족하지 못 한다면
                    flag = false;
                    break;
                }
            }

            if (flag) {     // 조건이 만족 됐다면 result +1
                result++;
            }
        }

        System.out.println(result);
    }
}