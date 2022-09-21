package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 최대한 큰 수를 빼주어야 최솟값이 나오므로, "-"을 기준으로 잘라 덧셈 부터 한다.
        String[] arr = str.split("-");

        for (int i=0; i<arr.length; i++) {
            // "-" 기준으로 잘라 "+" 포함된 식이라면
            if (arr[i].contains("+")) {
                StringTokenizer st = new StringTokenizer(arr[i], "+");
                int temp = 0;

                // 덧셈이 포함된 식을 더한다.
                while (st.hasMoreTokens()) {
                    temp += Integer.parseInt(st.nextToken());
                }

                // 더해진 값을 기존 index에 저장
                arr[i] = String.valueOf(temp);
            }
        }

        // 처음 문자는 숫자이므로 0 인덱스로 초기화
        int sum = Integer.parseInt(arr[0]);

        // 앞선 for문에서 덧셈이 완료된 후에 남은 값은 모두 -값을 갖으므로 모두 빼주면 최솟값이 나온다.
        for (int i=1; i<arr.length; i++) {
            sum -= Integer.parseInt(arr[i]);
        }

        System.out.println(sum);
    }
}
