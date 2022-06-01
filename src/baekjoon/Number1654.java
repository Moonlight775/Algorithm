package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int K = Integer.parseInt(st.nextToken());       // 기존 랜선의 개수
        int N = Integer.parseInt(st.nextToken());       // 자른 후 랜선의 개수

        int[] arr = new int[K];     // 이미 가지고 있는 랜선들의 길이를 담을 배열

        long max = 0;                // 0부터 최댓값 사이를 탐색하기 위해서 최댓값을 담을 변수 생성

        for (int i=0; i<K; i++) {
            arr[i] = Integer.parseInt(br.readLine());   // 배열 초기화

            if (arr[i] > max) max = arr[i];             // 최댓값을 구한다.
        }

        max = max + 1;  // 랜선이 1, 1이 주어질 경우 mid가 0이 되므로 범위를 +1해준다.

        long min = 0;
        long mid;

        while (min < max) {
            int cnt = 0;

            mid = (min + max) / 2;      // 최소와 최대의 중간값을 구한다.

            for (int i=0; i<K; i++) {
                cnt += arr[i] / mid;    // 각 랜선 길이를 중간값으로 잘랐을 때 몇개의 랜선이 나오는지 구하고 다 더해준다.
            }

            // 중간값으로 자른 후 나온 랜선의 개수가 만들고자 하는 랜선의 개수보다 작다면
            // 너무 길게 잘랐다는 의미이다. 더 짧게 자르기 위해서 최대 길이를 줄여준다.
            // 반대의 경우는 더 길게 잘라야 하므로 최소 길이를 늘려준다.
            if (cnt < N) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }

        System.out.println(min - 1);    // Upper Bound로 구해진 최대 길이는 구하고자 하는 최댓값+1이라서 -1을 해준다.
    }
}
