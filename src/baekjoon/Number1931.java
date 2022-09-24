package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Number1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 회의의 수
        int[][] arr = new int[N][2];    // 회의 시작시간과 끝나는 시간을 담을 배열

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int change = 0;

        for (int i=0; i<N-1; i=change) {

            for (int j=i+1; j<N; j++) {
                if (arr[i][1] <= arr[j][0]) {
                    count++;
                    change = j;
                    break;
                }
            }
        }

        System.out.println(count+1);
    }
}
