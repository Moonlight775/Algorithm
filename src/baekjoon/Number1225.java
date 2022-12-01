package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        String B = st.nextToken();  // B의 자릿수를 알기 위해 String으로 받는다

        int[] arr = new int[B.length()];    // A에 B를 반복해서 곱해주어야 하므로 배열에 저장

        for (int i=0; i<arr.length; i++) {
            arr[i] = B.charAt(i) - '0';
        }

        int result = 0; // 곱셈 결과

        while (A != 0) {
            int numOfA = A % 10;    // A에서 한 자리 뽑기 (일의 자리를 뽑음)

            for (int i=0; i<arr.length; i++) {
                result += numOfA * arr[i];  // A에서 뽑은 수에 B에서 뽑은 한 자리 수를 전부 곱함
            }

            A = A / 10; // 다음 A의 한 자리를 뽑기 위해 10을 나눠 줌
        }

        System.out.println(result);
    }
}
