package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number12891 {

    static int[] checkArr;
    static int[] myArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());   // DNA 문자열 길이
        int P = Integer.parseInt(st.nextToken());   // 비밀번호로 사용할 부분문자열의 길이
        int result = 0;                             // 만들 수 있는 비밀번호의 종류의 수
        char[] str = br.readLine().toCharArray();   // DNA 문자열 배열
        checkArr = new int[4];                      // 비밀번호 체크 배열 (부분문자열에 포함되어야 할 'A', 'C', 'G', 'T'의 개수)
        myArr = new int[4];                         // 현재 상태 배열
        checkSecret = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());

            if (checkArr[i] == 0) checkSecret++;
        }

        for (int i = 0; i < P; i++) {   // 초기 P 부분 문자열 처리 부분
            Add(str[i]);
        }
        if (checkSecret == 4) result++;

        // 슬라이딩 윈도우 처리 부분
        for (int i = P; i < S; i++) {
            int j = i - P;

            Add(str[i]);
            Remove(str[j]);

            if (checkSecret == 4) result++;  // 4자릿수와 관련된 크기가 모두 충족될 때 유효한 비밀번호
        }

        System.out.println(result);
        br.close();
    }

    private static void Add(char c) {   // 새로 들어온 문자를 처리하는 함수
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;

            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;

            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;

            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }

    private static void Remove(char c) {    // 제거되는 문자를 처리하는 함수
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;

            case 'C':
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;

            case 'G':
                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;

            case 'T':
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }
}