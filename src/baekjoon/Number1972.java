package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Number1972 {

    static Set<String> set;     // 문자열을 담을 Set
    static StringBuilder sb = new StringBuilder();
    static boolean flag;    // true면 놀라운 문자열, false면 아니다

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("*")) break;     // 입력된 문자열이 "*"면 종료
            set = new HashSet<>();

            flag = true;

            check(str);

            if (flag) {
                sb.append(str).append(" is surprising.").append('\n');
            }

        }

        System.out.println(sb);
    }

    // 놀라운 문자열인지 판단
    public static void check(String str) {
        int index = 1;

        // 문자열의크기-1 만큼 쌍이 생기므로 조건 범위를 문자열 크기-1로 지정
        for (int i=0; i<str.length()-1; i++) {

            for (int j=0; j<str.length(); j++) {
                // j+index가 문자열 크기보다 커지면 Exception이 떨어지므로 종료
                if (j+index >= str.length()) break;

                String S = "";
                S += str.charAt(j) + String.valueOf(str.charAt(j+index));

                if (set.contains(S)) {
                    sb.append(str).append(" is NOT surprising.").append('\n');
                    flag = false;
                    return;
                }
                else {
                    set.add(S);
                }
            }

            set.clear();    // 다음 쌍을 비교해주기 위해 set를 clear()해줌
            index++;
        }

    }
}
