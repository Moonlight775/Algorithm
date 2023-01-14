package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[][][] arr = new char[N][5][7];

        // 그림 초기화
        for (int i=0; i<N; i++) {
            for (int j=0; j<5; j++) {
                String str = br.readLine();
                for (int k=0; k<7; k++) {
                    arr[i][j][k] = str.charAt(k);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        int pic_num1 = 0;
        int pic_num2 = 0;

        // 그림끼리 비교
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                int count = 0;

                // 다른 칸의 개수 찾기
                for (int y=0; y<5; y++) {
                    for (int x=0; x<7; x++) {
                        if (arr[i][y][x] != arr[j][y][x]) {
                            count++;
                        }
                    }
                }

                // 다른 칸이 제일 적다면
                if (count < min) {
                    min = count;
                    pic_num1 = i+1;
                    pic_num2 = j+1;
                }

            }
        }

        System.out.println(pic_num1 + " " + pic_num2);
    }
}
