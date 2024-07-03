package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 참가자의 수

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] size = new int[6];

        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());   // 티셔츠 묶음 수
        int P = Integer.parseInt(st.nextToken());   // 펜의 묶음 수
        int count = 0;

        for (int i = 0; i < 6; i++) {
            count += size[i] / T;

            if (size[i] % T != 0) {
                count++;
            }
        }

        System.out.println(count);
        System.out.print(N / P + " " + N % P);
    }
}