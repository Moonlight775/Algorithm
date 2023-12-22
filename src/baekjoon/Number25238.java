package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number25238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Double.parseDouble(st.nextToken());   // 몬스터의 방어율 수치
        double b = Double.parseDouble(st.nextToken());   // 유저의 방무

        // 방어율 * 방무 퍼센트 = 무시하는 방어율
        // 몬스터 방어율 - 무시하는 방어율 = 유저 체감 방어율
        double result = a - (a * (b / 100));

        if (result >= 100) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}