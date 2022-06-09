package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];    // 몸무게, 키를 담을 2차원 배열 생성
        int[] grade = new int[N];       // 등수를 담을 배열 생성

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());   // 몸무게 초기화
            arr[i][1] = Integer.parseInt(st.nextToken());   // 키 초기화

            grade[i] = 1;   // 등수를 모두 1로 초기화
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {

                if (arr[i][0] < arr[j][0]) {        // 몸무게가 다른 사람보다 작다면
                    if (arr[i][1] < arr[j][1]) {    // 키를 비교, 키도 작다면
                        grade[i]++;                 // 등수를 +1
                    }
                }

            }
        }

        for (int value : grade) {
            System.out.print(value + " ");
        }
    }
}
