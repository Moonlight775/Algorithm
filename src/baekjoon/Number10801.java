package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number10801 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[10];
        int[] B = new int[10];
        int count_A = 0;
        int count_B = 0;

        for (int i = 0; i < 10; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                count_A++;
            }
            else if (A[i] < B[i]) {
                count_B++;
            }
        }

        if (count_A > count_B) {
            System.out.println("A");
        } else if (count_A < count_B) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }
    }
}