package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1063 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] king = st.nextToken().toCharArray(); // 킹의 위치
        char[] rock = st.nextToken().toCharArray(); // 돌의 위치
        int N = Integer.parseInt(st.nextToken());   // 움직이는 횟수

        while (N-- > 0) {
            String move = br.readLine();    // 움직임

            // 움직인 후 체스판 밖으로 나가는 경우 이동을 건너뛰어야 하므로 나가지 않을 때만 값을 변화하기 위해 temp 변수 사용
            char[] temp_king = Arrays.copyOf(king, king.length);
            char[] temp_rock = Arrays.copyOf(rock, rock.length);

            moving(move, temp_king);    // 움직임에 따른 변화
            if (check(temp_king)) continue; // 체스판 밖으로 나가는 경우 이번 움직임은 continue로 넘어가준다.

            if (Arrays.equals(temp_king, temp_rock)) {  // 킹이 돌의 위치로 이동하는 경우 돌도 같은 움직임으로 이동
                moving(move, temp_rock);
                if (check(temp_rock)) continue;
            }

            // 체스판 내에서 움직였다면 변수에 저장
            king = temp_king;
            rock = temp_rock;
        }

        System.out.println(king);
        System.out.println(rock);
    }

    // 체스판 범위 안에 있는지 확인하는 메서드
    private static boolean check(char[] pices) {
        return pices[0] < 'A' || pices[0] > 'H' || pices[1] < '1' || pices[1] > '8';
    }

    // 움직임에 따른 변화 메서드
    private static void moving(String move, char[] pices) {
        switch (move) {
            case "R" : pices[0]++;
                break;
            case "L" : pices[0]--;
                break;
            case "B" : pices[1]--;
                break;
            case "T" : pices[1]++;
                break;
            case "RT" : pices[0]++; pices[1]++;
                break;
            case "LT" : pices[0]--; pices[1]++;
                break;
            case "RB" : pices[0]++; pices[1]--;
                break;
            case "LB" : pices[0]--; pices[1]--;
                break;
        }
    }
}
