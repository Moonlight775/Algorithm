package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];       // 파일 이름을 담을 배열

        for (int i=0; i<N; i++) {
            str[i] = br.readLine();         // 입력받은 파일 이름으로 배열 초기화
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str[0].length(); i++) {     // 파일 이름의 길이는 모두 같으므로 index 0의 문자열 크기로 조건
            boolean same = false;                   // 알파벳이 동일한지 판단하기 위한 boolean

            for (int j=0; j<N-1; j++) {             // 주어진 파일 이름의 개수만큼 서로 비교하도록 한다.
                if (str[j].charAt(i) != str[j + 1].charAt(i)) {   // 다른 파일 이름의 알파벳이 있다면
                    same = true;                    // boolean을 true로 변경
                    break;
                }
            }

            if (same) {     // 다른 알파벳이 있다면
                sb.append('?');     // '?' 출력
            }
            else {
                sb.append(str[0].charAt(i));    // 아니라면 모두 같은 알파벳이므로 해당 알파벳 출력
            }
        }

        System.out.println(sb);
    }
}
