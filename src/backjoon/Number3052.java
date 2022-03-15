package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        boolean check;
        int count = 0;

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for (int i=0; i<arr.length; i++) {
            check = false;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                count++;
            }
        }

        System.out.println(count);
    }
}
