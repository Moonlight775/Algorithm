package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number14582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[9];   // 울림 제미니스 점수
        int[] b = new int[9];   // 스타트링크 걸리버스 점수

        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 9; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int a_score = 0;
        int b_score = 0;
        boolean flag = false;

        for (int i = 0; i < 9; i++) {
            a_score += a[i];

            // N회 초에 득점해서 b보다 점수가 높으면 이기고 있는 순간 발생
            if (a_score > b_score) {
                flag = true;
                break;
            }

            b_score += b[i];
        }

        if (flag) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}