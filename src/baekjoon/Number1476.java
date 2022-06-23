package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 입력받는 수와 비교하기 위한 변수
        int e = 1;
        int s = 1;
        int m = 1;
        int year = 1;

        while (true) {
            if (e == E && s == S && m == M) break;  // 입력받은 수와 같아진다면 종료
            e++;
            s++;
            m++;
            year++;

            if (e == 16) e = 1;     // e의 범위는 15이하까지라서 16이 되면 다시 1로 초기화
            if (s == 29) s = 1;     // s도 마찬가지로 범위에 따라 초기화
            if (m == 20) m = 1;
        }
        System.out.println(year);   // while문 종료된 후의 year이 E S M으로 표시되는 가장 빠른 연도이다.
   }
}
