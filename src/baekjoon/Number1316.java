package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 단어의 개수
        boolean[] check = new boolean[26];          // 문자마다 겹치는 것을 체크하기 위한 배열
        int prev = 0;   // 이 전 문자
        int cnt = N;    // 그룹 단어의 수

        for (int i=0; i<N; i++) {
            String str = br.readLine();             // 입력된 문자열
            Arrays.fill(check, Boolean.FALSE);      // check 배열을 초기화
            prev = 0;                               // 이 전 문자 초기화

            for (int j=0; j<str.length(); j++){
                int ch = str.charAt(j);

                if(prev != ch) {    // 현재 문자가 이 전 문자와 다르다면

                    if(!check[ch-'a']) {        // a라고 한다면 check[0]이 되고, boolean 배열의 초기값은 false이므로 false일 경우 조건이 true가 된다.
                        check[ch-'a'] = true;   // 해당 문자가 나왔으니 true로 바꿔준다.
                        prev = ch;              // 다음 문자를 비교하기 위해서 prev에 현재 문자를 넣어 준다.
                    } else if(check[ch-'a'] == true) {  // check 배열이 true라면 전에 나왔던 문자가 또 나왔다는 말이므로 그룹 단어가 아니게 된다.
                        cnt--;  // 그룹 문자가 아니므로 count를 빼준다.
                        break;  // 계속해서 for문이 돌면서 지속적으로 count를 빼주는 것을 방지하기 위해서 break해준다.
                    }

                }
            }
        }
        System.out.println(cnt);
    }
}
