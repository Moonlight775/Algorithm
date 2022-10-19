package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number1331 {

    static int prevX;
    static int prevY;
    static int nowX;
    static int nowY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> visit = new ArrayList<>();
        String str = br.readLine();

        int startX = str.charAt(0);
        int startY = str.charAt(1);

        prevX = startX;
        prevY = startY;

        visit.add(str);

        for (int i=0; i<35; i++) {
            String st = br.readLine();
            nowX = st.charAt(0);
            nowY = st.charAt(1);

            // 방문했던 위치를 다시 방문한다면 Invalid
            if (visit.contains(st)) {
                System.out.println("Invalid");
                return;
            }

            // 나이트가 이전 위치에서 이동 불가한 위치라면 Invalid
            if (Math.abs(nowX - prevX) == 2 && Math.abs(nowY - prevY) == 1 || Math.abs(nowX - prevX) == 1 && Math.abs(nowY - prevY) == 2) {
            }
            else {
                System.out.println("Invalid");
                return;
            }

            visit.add(st);
            prevX = nowX;
            prevY = nowY;

        }
        // 마지막 위치에서 첫 번째 위치로 갈 수 없으면 Invalid
        if(Math.abs(nowX - startX) == 2 && Math.abs(nowY - startY) == 1 || Math.abs(nowX - startX) == 1 && Math.abs(nowY - startY) == 2) {
        }
        else {
            System.out.println("Invalid");
            return;
        }

        System.out.println("Valid");
    }
}
