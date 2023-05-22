package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number6996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str1 = st.nextToken();   // 첫 번째 단어
            String str2 = st.nextToken();   // 두 번째 단어
            int[] alphabet = new int[26];   // 알파벳 배열

            if (check(str1, str2, alphabet)) {
                System.out.println(str1 + " & " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " & " + str2 + " are NOT anagrams.");
            }
        }
    }

    // 애너그램 판단 메소드
    public static boolean check(String str1, String str2, int[] alphabet) {
        // 단어 길이가 다르면 애너그램 X
        if (str1.length() != str2.length()) {
            return false;
        }

        // 첫 번째 단어의 알파벳에 해당하는 배열 인덱스 +1
        for (int i = 0; i < str1.length(); i++) {
            int index = str1.charAt(i) - 'a';
            alphabet[index]++;
        }

        // 두 번재 단어의 알파벳에 해당하는 배열 인덱스 -1
        for (int i = 0; i < str2.length(); i++) {
            int index = str2.charAt(i) - 'a';
            alphabet[index]--;
        }

        // 배열 값이 0이 아니라면 알파벳의 개수가 다르므로 애너그램 X
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
