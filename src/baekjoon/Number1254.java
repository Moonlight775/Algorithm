package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int length = str.length();  // 팰린드롬 길이

        for (int i=0; i<str.length(); i++) {
            if (isPalindrome(str.substring(i))) {   // 팰린드롬 이라면
                break;
            }
            length++;   // 팰린드롬이 아니라면 주어진 문자열 뒤에 한 글자씩 추가해줌
        }

        System.out.println(length);
    }

    public static boolean isPalindrome(String str) {
        int reverse = str.length()-1;   // 주어진 문자열의 뒤에서부터 읽을때를 위한 변수

        for (int i=0; i<str.length()/2; i++) {
            // 문자열이 팰린드롬이 아니라면 return false
            if (str.charAt(i) != str.charAt(reverse-i)) {
                return false;
            }
        }
        // 팰린드롬이라면 return true
        return true;
    }

}
