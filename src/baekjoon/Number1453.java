package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[101];
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (arr[num] == true) {
                result++;
            }
            else {
                arr[num] = true;
            }
        }

        System.out.println(result);
    }
}
