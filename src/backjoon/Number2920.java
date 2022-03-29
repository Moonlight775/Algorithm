package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] num = new int[8];
        int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] des = {8, 7, 6, 5, 4, 3, 2, 1};

        for (int i=0; i<num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        if (Arrays.equals(num, asc)) {
            System.out.println("ascending");
        } else if (Arrays.equals(num, des)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
