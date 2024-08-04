package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number11098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (n-- > 0) {
            int p = Integer.parseInt(br.readLine());    // 선수의 수
            int[] price = new int[p];   // 선수의 가격 배열
            String[] name = new String[p];  // 선수의 이름 배열
            int max = 0;    // 가격 최댓값
            int index = 0;  // 최댓값의 인덱스

            for (int i = 0; i < p; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                price[i] = Integer.parseInt(st.nextToken());
                name[i] = st.nextToken();

                if (price[i] > max) {
                    max = price[i];
                    index = i;
                }
            }

            System.out.println(name[index]);
        }
    }
}