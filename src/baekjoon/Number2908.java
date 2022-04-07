package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb;
        String[] reverse = new String[2];
        int max = 0;

        for (int i=0; i< reverse.length; i++){
            sb = new StringBuilder(st.nextToken());
            reverse[i] = sb.reverse().toString();
            if (Integer.parseInt(reverse[i]) > max) {
                max = Integer.parseInt(reverse[i]);
            }
        }

        System.out.println(max);
    }
}
