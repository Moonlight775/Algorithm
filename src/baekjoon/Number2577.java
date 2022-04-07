package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        int[] arr = new int[10];

        while (true) {
            int num = val%10;
            arr[num]++;
            val = val/10;
            if (val == 0) break;
        }

        for (int result : arr) {
            System.out.println(result);
        }
    }
}
