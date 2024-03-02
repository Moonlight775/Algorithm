package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[3]; // 세 변을 담을 배열

            for (int i = 0; i < 3; i++) {   // 배열 초기화
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int a = arr[0];
            int b = arr[1];
            int c = arr[2]; // 가장 긴 변

            if (a == 0 && b == 0 && c ==0) break;

            if (a + b <= c) {   // 삼각형 조건을 만족하지 못 한다면
                sb.append("Invalid").append('\n');
            }
            else if (a == b && b == c) {    // 세 변의 길이가 모두 같을 경우
                sb.append("Equilateral").append('\n');
            }
            else if (a != b && a != c && b != c) {  // 세 변의 길이가 모두 다른 경우
                sb.append("Scalene").append('\n');
            }
            else {  // 두 변의 길이만 같은 경우
                sb.append("Isosceles").append('\n');
            }
        }

        System.out.println(sb);
    }
}