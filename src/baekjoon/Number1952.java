package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());   // 세로
        int N = Integer.parseInt(st.nextToken());   // 가로
        int count = 0;

        // 세로가 가로보다 클 경우
        // 코너를 지날때 마다 가로로 지나가는 횟수는 줄어든다
        // 가로가 1보다 작아지는 경우는 더 이상 코너가 안 생기므로 종료
        if (M > N) {
            while (true) {
                N--;
                count++;
                if (N < 1) break;
                count++;
            }
        }
        // 가로가 세로보다 클 경우
        // 가로 -> 대각선 -> 세로-1 -> 대각선 -> 가로 -> 대각선 -> 세로-1 -> ...
        // 세로가 1과 같아지면 더 이상 꺾어지는 부분이 생기지 않으므로 종료
        else if (M < N) {
            while (M > 1) {
                count++;
                M--;
                count++;
            }
        }
        // 정사각형 모양일 경우 2X2 = 2, 3X3 = 4, 4X4 = 6, ... 식으로 꺾어지는 횟수 증가
        // 등차수열이므로 일반항 공식(a_n = a + (n-1)d) 에서 변형하여 수식 생성
        // M, N이 2일 경우가 1항이나 마찬가지 이므로 (n-1) -> (n-2)로 변경
        else {
            count = 2 + (N - 2) * 2;
        }

        System.out.println(count);
    }
}
