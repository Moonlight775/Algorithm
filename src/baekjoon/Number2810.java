package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String seat = br.readLine();

        int count = 1;  // 맨 오른쪽 컵홀더 1개가 있으므로 1로 시작

        // S든 L이든 왼쪽엔 무조건 컵홀더가 있다
        // L일때만 2칸 이동
        for (int i = 0; i < seat.length(); i++) {
            if (seat.charAt(i) == 'L') {
                i++;
            }
            count++;
        }

        System.out.println(Math.min(count, N));
    }
}
