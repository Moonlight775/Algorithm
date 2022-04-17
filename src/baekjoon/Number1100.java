package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 0;    // 하얀 칸 위에 있는 말의 개수
        String[][] chess = new String[8][8];    // 체스판 크기의 배열

        for (int i=0; i<chess.length; i++) {
            st = new StringTokenizer(br.readLine(), "");    // 공백없이 입력되는 값을 구분
            // 8개의 문자를 입력 받음 (for문의 조건범위에 의해 8개 이상 입력 받더라도 8개만이 쓰인다. 그 이하는 StringIndexOutOfBoundsException이 떨어진다.)
            String str = st.nextToken();

            for (int j=0; j<chess[0].length; j++) {
                // 문자열로 입력 받으므로 1개씩 charAt()을 사용하여 문자로 잘라주고 다시 String형식으로 변환시켜준다.
                chess[i][j] = String.valueOf(str.charAt(j));
            }
        }

        for (int i=0; i<chess.length; i++) {

            for (int j=0; j<chess[0].length; j++) {
                // 하얀 칸의 좌표를 합하여 보면 짝수임을 알 수 있다. 하여 (i+j)%2가 0이라면 하얀칸인 것이고, 하얀칸 중 F가 위치해있다면 카운트해준다.
                if((i+j)%2 == 0 && chess[i][j].equals("F")) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
