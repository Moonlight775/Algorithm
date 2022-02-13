package simpleQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        if (cnt < 1 || cnt > 1000000) return;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int i = 0;
        int[] num = new int[cnt];

        while(st.hasMoreTokens()) {
            num[i] = Integer.parseInt(st.nextToken());
            if(num[i] < -1000000 || num[i] > 1000000) return;
            i++;
        }

        Arrays.sort(num);
        System.out.println(num[0] + " " + num[cnt-1]);
    }
}
