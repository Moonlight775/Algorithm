package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number4562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 데이터 세트 수

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int X = Integer.parseInt(st.nextToken());   // 좀비가 먹는 뇌의 수
            int Y = Integer.parseInt(st.nextToken());   // 좀비가 살아남는데 필요한 뇌의 수

            if (X < Y) {
                System.out.println("NO BRAINS");
            } else {
                System.out.println("MMM BRAINS");
            }
        }
    }
}
