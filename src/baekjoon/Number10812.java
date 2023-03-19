package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number10812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        //  바구니 배열 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());

            int begin = Integer.parseInt(st.nextToken()) - 1;   // 시작 바구니
            int end = Integer.parseInt(st.nextToken()) - 1;     // 끝 바구니
            int mid = Integer.parseInt(st.nextToken()) - 1;     // 기준 바구니
            int[] temp = new int[mid - begin];  // 회전 후 덮어써지는 부분을 기록하는 배열
            int b = begin;

            for (int i = 0; i < temp.length; i++) {
                temp[i] = arr[b];
                b++;
            }

            for (int i = mid; i <= end; i++) {
                arr[begin] = arr[i];
                begin++;
            }

            for (int j : temp) {
                arr[begin] = j;
                begin++;
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
