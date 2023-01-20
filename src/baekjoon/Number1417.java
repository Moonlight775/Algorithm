package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(0);
            return;
        }

        int one = Integer.parseInt(br.readLine());

        int[] arr = new int[N-1];

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        while (true) {
            Arrays.sort(arr);
            if (arr[N-2] < one) break;
            count++;
            arr[N-2]--;
            one++;
        }

        System.out.println(count);
    }
}