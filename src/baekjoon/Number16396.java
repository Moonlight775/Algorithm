package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number16396 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 선의 개수
        int[] line = new int[10001];    // 좌표 배열

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            for (int i = X; i < Y; i++) {   // 좌표에 해당하는 선 부분은 1로 초기화
                line[i] = 1;
            }
        }

        System.out.println(Arrays.stream(line).sum());
    }
}