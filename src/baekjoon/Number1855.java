package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1855 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int col = Integer.parseInt(br.readLine());    // 열의 개수
        String str = br.readLine();     // 문자열
        int row = str.length() / col;       // 행의 개수

        char[][] arr = new char[row][col];  // 암호화 배열
        int even_ord = 0;    // 문자열의 짝수 행일때 문자 순서
        int odd_ord;         // 문자열의 홀수 행일때 문자 순서

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i % 2 == 0) {   // 짝수 행이라면
                    arr[i][j] = str.charAt(even_ord);
                } else {    // 홀수 행이라면
                    // 홀수 행은 오른쪽 -> 왼쪽으로 채워야 하므로 문자열의 입력 순서를 바꿔준다.
                    // 왼쪽부터 채워지므로 문자열을 읽는 순서를 바꾸는 것
                    // 행, 열과 문자열의 순서는 0부터 시작
                    // 그래서 i와 j에 +1씩 해주는 것
                    // (행+1)*열의 개수 - 열의 순서+1
                    odd_ord = ((i + 1) * col) - (j + 1);
                    arr[i][j] = str.charAt(odd_ord);
                }
                even_ord++;     // 짝수행은 일반적인 배열을 채우듯이 채우면 되므로 계속 +1
            }
        }

        // 원래 문자열 출력을 위해 행부터 출력
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i]);
            }
        }
    }
}