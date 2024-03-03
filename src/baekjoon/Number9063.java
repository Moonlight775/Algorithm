package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 점의 개수
        int[] X = new int[N];   // x 좌표 배열
        int[] Y = new int[N];   // y 좌표 배열

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            X[i] = Integer.parseInt(st.nextToken());
            Y[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(X);
        Arrays.sort(Y);

        int result = (X[N - 1] - X[0]) * (Y[N - 1] - Y[0]);

        if (N <= 1) {
            System.out.println(0);
        }
        else {
            System.out.println(result);
        }
    }
}