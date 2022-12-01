package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();  // B의 자릿수를 알기 위해 String으로 받는다

        int[] arr = new int[B.length()];    // A에 B를 반복해서 곱해주어야 하므로 배열에 저장

        for (int i=0; i<arr.length; i++) {
            arr[i] = B.charAt(i) - '0';
        }

        int result = 0; // 곱셈 결과

        for (int i=0; i<A.length(); i++) {
            int pieceOfA = A.charAt(i) - '0';

            for (int j=0; j<arr.length; j++) {
                result += pieceOfA * arr[j];
            }
        }

        System.out.println(result);
    }
}
