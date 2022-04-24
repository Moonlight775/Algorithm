package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];    // x,y 2차원 배열

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {  // 배열 오름차순 정렬, 람다식 사용 (new Comparator<int[]>() {})
            if (e1[0] == e2[0]) {       // x좌표가 같다면
                return e1[1] - e2[1];   // y좌표가 증가하는 순서로 정렬
            } else {
                return e1[0] - e2[0];   // x좌표가 같지 않으면 x좌표로 결정
            }
        });

        for (int i=0; i<N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}
