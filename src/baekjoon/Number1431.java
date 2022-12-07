package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 기타의 개수

        String[] arr = new String[N];   // 시리얼 번호 배열

        // 배열 초기화
        for (int i=0; i<N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() == o2.length()) {   // 2번 조건, 시리얼번호의 길이가 같다면
                int o1Sum = compareSum(o1);
                int o2Sum = compareSum(o2);

                if (o1Sum == o2Sum) {           // 3번 조건, 2번 조건도 같다면 사전순으로 비교
                    return o1.compareTo(o2);
                }
                else {
                    return o1Sum - o2Sum;
                }
            }

            else {
                return  o1.length() - o2.length();  // 1번 조건, 길이가 짧은 것이 먼저 오도록
            }
        });

        for (String value : arr) {
            System.out.println(value);
        }
    }

    // 시리얼 번호 중 숫자인 부분의 합을 구하는 메소드
    public static int compareSum(String str) {
        int sum = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += str.charAt(i) - '0';
            }
        }

        return sum;
    }
}
