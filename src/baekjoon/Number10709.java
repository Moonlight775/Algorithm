package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number10709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());   // 행
        int W = Integer.parseInt(st.nextToken());   // 열
        char[][] city = new char[H][W]; // 현재 각 구역의 구름 위치
        int[][] arr = new int[H][W];

        // 구름 위치 초기화
        for (int i = 0; i < H; i++) {
            String str = br.readLine();
            for (int j = 0; j < W; j++) {
                city[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < H; i++) {
            boolean flag = false;   // 행에 구름이 있으면 true
            int num = 1;    // 지역에 구름이 오는 시간(분)

            for (int j = 0; j < W; j++) {
                if (city[i][j] == 'c') {    // 행에 구름이 있다면
                    flag = true;
                    num = 1;    // 구름이 여러 위치에 있는 경우 더 동쪽에 있는 구름의 오른쪽 구역은 새로 카운트해야 하므로 1로 초기화
                    arr[i][j] = 0;
                }
                else if (city[i][j] != 'c' && flag) {   // '.'이고 왼쪽에 구름이 있다면
                    arr[i][j] = num++;
                }
                else {  // 위 조건에 맞지 않다면 '.'이므로 -1 저장
                    arr[i][j] = -1;
                }
            }
        }

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}