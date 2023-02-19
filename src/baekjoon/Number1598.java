package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());    // 첫 번째 자연수
        int num2 = Integer.parseInt(st.nextToken());    // 두 번째 자연수

        // 첫 번째 자연수의 행 위치
        // 4줄로 이루어진 표이므로 4로 나눴을 때 나머지가 발생하면 그 나머지가 행의 위치
        // 나머지가 0일 경우는 4번째 행
        int row_num1 = num1 % 4 == 0 ? 4 : num1 % 4;

        // 첫 번째 자연수의 열 위치
        // 4로 나눴을 때 나머지가 있는 경우는 몫에 +1한 값이 열의 위치
        // 나머지가 0일 경우는 +1할 필요가 없다.
        int col_num1 = num1 % 4 == 0 ? num1 / 4 : (num1 / 4)+1;

        // 위와 같은 방식
        int row_num2 = num2 % 4 == 0 ? 4 : num2 % 4;
        int col_num2 = num2 % 4 == 0 ? num2 / 4 : (num2 / 4)+1;

        // 좌표가 구해졌다면 (x, y) y는 y끼리 x는 x끼리의 차가 각 행과 열의 거리 차가 된다.
        // 각 값은 - 값이 나올 수 있으므로 절대값 처리해준다.
        int width = Math.abs(col_num1 - col_num2);
        int height = Math.abs(row_num1 - row_num2);

        System.out.println(width + height);
    }
}
