package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];    // x, y 좌표를 담을 2차원 배열

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());       // x좌표
            arr[i][1] = Integer.parseInt(st.nextToken());       // y좌표
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) {       // index 1에 담겨 있는 y좌표가 같다면
                return o1[0] - o2[0];   // index 0에 담겨 있는 x좌표의 오름차순으로 정렬
            } else {
                return o1[1] - o2[1];   // y좌표의 오름차순 정렬
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}
