package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Number11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();     // 입력된 문자열

        HashSet<String> set = new HashSet<>();

        for (int i=0; i<str.length(); i++) {
            for (int j=i+1; j<=str.length(); j++) {
                set.add(str.substring(i, j));   // 모든 경우를 set에 담는다. (set으로 중복은 제외된다)
            }
        }

        System.out.println(set.size());
    }
}
