package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 과일의 개수
        int L = Integer.parseInt(st.nextToken());   // 초기 길이
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);   // 과일 높이 오름차순 정렬

        for (int i = 0; i < N; i++) {
            if (arr[i] <= L) {  // 과일보다 길이가 더 길다면
                L++;
            }
            else {
                break;
            }
        }

        System.out.println(L);
    }
}