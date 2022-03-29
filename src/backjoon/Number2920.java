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

        int[] num = new int[8]; // 입력받은 수들을 담을 배열
        int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};   // ascending에 맞는 배열
        int[] des = {8, 7, 6, 5, 4, 3, 2, 1};   // descending에 맞는 배열

        for (int i=0; i<num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());  // 입력받는 수들을 스페이스 기준으로 잘라내어 배열에 담는다.
        }

        if (Arrays.equals(num, asc)) {  // 입력받은 수의 배열과 ascending 배열이 일치할 경우
            System.out.println("ascending");
        } else if (Arrays.equals(num, des)) {   // 입력받은 수의 배열과 descending 배열이 일치할 경우
            System.out.println("descending");
        } else {    // 그 외일 경우
            System.out.println("mixed");
        }
    }
}
