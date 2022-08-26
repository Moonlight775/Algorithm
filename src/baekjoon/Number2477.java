package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());    // 1m^2 당 참외의 개수

        int[][] field = new int[6][2];  // 참외밭의 변의 방향과 길이를 담을 배열

        int width_max = 0;
        int height_max = 0;

        int width_max_index = 0;
        int height_max_index = 0;

        for (int i=0; i<6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            field[i][0] = Integer.parseInt(st.nextToken()); // 변의 방향
            field[i][1] = Integer.parseInt(st.nextToken()); // 변의 길이
        }

        for (int i=0; i<6; i++) {

            if (field[i][0] == 1 || field[i][0] == 2) {     // 동, 서 라면 (가로 길이라면)
                if (width_max < field[i][1]) {              // 최대 가로길이를 구하기
                    width_max = field[i][1];
                    width_max_index = i;    // 최대 가로길이의 인덱스
                }
            }

            else if (field[i][0] == 3 || field[i][0] == 4) {    // 남, 북 이라면 (세로 길이라면)
                if (height_max < field[i][1]) {                 // 최대 세로길이를 구하기
                    height_max = field[i][1];
                    height_max_index = i;   // 최대 세로길이의 인덱스
                }
            }

        }

        int width_min;
        int height_min;

        int right;
        int left;

        // 최대 가로 길이의 양 옆 세로 길이를 빼면 작은 사각형의 세로 길이를 알 수 있다.
        // 최대 세로 길이의 양 옆 가로 길이를 빼면 작은 사각형의 가로 길이를 알 수 있다.
        // 최대 가로, 세로 길이의 양 옆의 값을 찾기 위해 index 이용
        // 가로, 세로 양 옆 index는 동일하게 최대 길이의 index값의 +1, -1한 값이다.

        // +1했을 때 배열크기를 넘으면 오버플로 해주고
        // -1했을 때 -1값이 나오면 언더플로 해준다.
        // 각 경우를 가정하여 값을 따로 담을 변수로 right와 left를 생성
        if (width_max_index + 1 == 6) {
            right = 0;
        }
        else {
            right = width_max_index + 1;
        }

        if (width_max_index - 1 == -1) {
            left = 5;
        }
        else {
            left = width_max_index - 1;
        }

        height_min = Math.abs(field[right][1] - field[left][1]);    // 작은 사각형의 세로 길이


        if (height_max_index + 1 == 6) {
            right = 0;
        }
        else {
            right = height_max_index + 1;
        }

        if (height_max_index - 1 == -1) {
            left = 5;
        }
        else {
            left = height_max_index - 1;
        }

        width_min = Math.abs(field[right][1] - field[left][1]);     // 작은 사각형의 가로 길이

        int area = (width_max * height_max) - (width_min * height_min); // 큰 사각형 - 작은 사각형이 밭의 넓이

        System.out.println(area * K);
    }
}
