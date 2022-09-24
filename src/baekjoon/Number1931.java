package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 회의의 수
        int[][] arr = new int[N][2];    // 회의 시작시간과 끝나는 시간을 담을 배열

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());   // 시작시간
            arr[i][1] = Integer.parseInt(st.nextToken());   // 끝나는 시간
        }

        Arrays.sort(arr, (o1, o2) -> {
            // 끝나는 시간이 같을 경우 시작시간이 빠른순으로 정렬
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }

            return o1[1] - o2[1];
        });

        int count = 0;
        int prevEndTime = 0;

        for (int i=0; i<N; i++) {
            // 직전 끝나는 시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
            if (prevEndTime <= arr[i][0]) {
                prevEndTime = arr[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
