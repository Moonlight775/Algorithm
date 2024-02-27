package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number30454 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 얼룩말의 개체수
        int L = Integer.parseInt(st.nextToken());   // 얼룩말의 몸통 길이
        int[] answer = new int[L / 2 + 2];  // 최대 검은 줄의 개수와 개체수를 파악하기 위한 배열

        for (int i = 0; i < N; i++) {
            int count = 0;  // 검은 줄 개수
            String str = br.readLine();     // 얼룩말 털 상태

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    if (j == 0) {   // 시작이 1이라면 검은줄이 있다는 것이므로 count +1
                        count++;
                    }
                    else {
                        if (str.charAt(j - 1) == '0') {
                            count++;
                        }
                    }
                }
            }
            answer[count]++;    // 검은 줄의 개수에 해당하는 배열 index +1
        }

        for (int i = answer.length - 1; i >= 0; i--) {
            if (answer[i] != 0) {
                // 배열의 뒤쪽 부터 확인하며 0이 아닌 데이터가 있는 index가 검은 줄의 최대 개수를 뜻함
                // 그 index에 있는 데이터 값이 얼룩말의 개체수
                System.out.println(i + " " + answer[i]);
                break;
            }
        }
    }
}