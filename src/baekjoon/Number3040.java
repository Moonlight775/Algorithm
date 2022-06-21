package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];     // 모든 난쟁이들을 담을 배열
        int fake1 = 0;  // 가짜1
        int fake2 = 0;  // 가짜2
        int sum = 0;    // 모든 합을 담을 변수

        for (int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];  // 난쟁이들의 모든 수를 더한다.
        }

        for (int i=0; i<8; i++) {           // j는 i+1이므로 조건 범위를 8까지 해준다.
            for (int j=i+1; j<9; j++) {
                if (sum - (arr[i]+arr[j]) == 100) {     // 총 합에서 가짜 2명을 빼면 100이 된다.
                    fake1 = i;  // 가짜들의 인덱스 번호를 얻는다.
                    fake2 = j;
                    break;
                }
            }
        }

        for (int i=0; i<arr.length; i++) {
            if (i == fake1 || i == fake2) {     // 가짜들의 인덱스 번호는 무시하고 출력하도록
                continue;
            }
            System.out.println(arr[i]);
        }

    }
}
