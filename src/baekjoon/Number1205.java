package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());       // 리스트에 있는 점수 개수
        int score = Integer.parseInt(st.nextToken());   // 새로운 점수
        int P = Integer.parseInt(st.nextToken());       // 리스트에 올라 갈 수 있는 점수의 개수
        int count = 1;  // 등수

        if (N == 0) {   // 리스트에 점수가 없다면 무조건 1등
            System.out.println(1);
        }
        else {
            st = new StringTokenizer(br.readLine(), " ");
            int[] scoreBoard = new int[N];
            for (int i=0; i<N; i++) {
                scoreBoard[i] = Integer.parseInt(st.nextToken());   // 점수판 리스트 초기화
            }

            if (N == P && scoreBoard[N-1] >= score) {   // 리스트 마지막 점수와 같더라도 -1 출력
                System.out.println(-1);
            }
            else {
                for (int i=0; i<N; i++) {
                    if (scoreBoard[i] > score) {    // 리스트의 점수가 새로운 점수보다 높다면 등수 +1
                        count++;
                    }
                    else {
                        break;
                    }
                }
                System.out.println(count);
            }

        }
    }
}
