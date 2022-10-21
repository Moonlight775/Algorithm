package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result = 0;

        // N이 1이면 시작지점만만 채워짐
        if (N == 1) {
            result = 1;
        }

        // 세로 길이가 2라면 2, 3번 방법으로만 이동 가능
        else if (N == 2) {
            result = Math.min((M+1)/2, 4);
        }

        else if (N >= 3) {
            // N이 3이상이고 M이 7이상이면 5번 이상 이동 가능
            // 4가지 방법으로 이동 후에는 1, 4번 방법으로 1칸씩만 오른쪽으로 이동하여 M-2 칸을 갈 수 있음
            if (M < 7) {
                result = Math.min(M, 4);
            }
            else {
                result = M - 2;
            }
        }

        System.out.println(result);
    }
}
