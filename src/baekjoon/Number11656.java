package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Number11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String[] arr = new String[S.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.substring(i);
        }

        // 사전순 정렬
        Arrays.sort(arr, Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();

        for (String a : arr) {
            sb.append(a).append('\n');
        }

        System.out.println(sb);
    }
}