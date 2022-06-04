package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] c = br.readLine().toCharArray();     // 입력받은 문자열을 문자로 잘라 배열 초기화
        char compare = c[0];                        // 초기값 compare 변수에 초기화
        int high = 10;                              // 첫 번째 그릇의 높이는 무조건 10cm이므로

        for (int i=1; i<c.length; i++) {            // 두 번째 그릇부터 비교
            if (compare == c[i]) {                  // 그릇의 방향이 같다면
                high += 5;                          // 전체 높이 +5
                compare = c[i];                     // 다음 비교를 위해 초기화
            } else {                                // 그릇의 방향이 다르다면
                high += 10;                         // 전체 높이 +10
                compare = c[i];                     // 다음 비교를 위해 초기화
            }
        }

        System.out.println(high);
    }
}
