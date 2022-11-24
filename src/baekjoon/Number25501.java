package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number25501 {

    static int count;   // recursion 함수 호출 횟수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트케이스의 개수

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<T; i++) {
            String S = br.readLine();
            count = 0;

            sb.append(isPalindrome(S)).append(" ").append(count).append('\n');
        }

        System.out.println(sb);
    }

    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
