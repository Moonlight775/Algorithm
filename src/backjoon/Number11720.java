package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 숫자의 개수
        String str = br.readLine(); // 숫자를 문자열로 받는다.
        int sum = 0;

        for(char c : str.toCharArray()) {   // 문자열을 char형 배열로 바꾼 후 for문으로 돌려준다.
            sum += c - '0'; // int형으로 변경하여 합산해준다.
        }

        System.out.println(sum);

    }
}
