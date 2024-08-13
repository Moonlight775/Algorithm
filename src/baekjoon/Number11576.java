package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Number11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());   // 진법 A
        int B = Integer.parseInt(st.nextToken());   // 진법 B
        int m = Integer.parseInt(br.readLine());    // 자리수의 개수
        int[] arr = new int[m + 1];     // 각 자리의 숫자를 담을 배열

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int decimal = 0;

        // A진법 -> 10진법 변환
        for (int i = 1; i <= m; i++) {
            decimal += arr[i] * Math.pow(A, m - i);
        }

        Stack<Integer> stack = new Stack<>();

        // 10진법 -> B 진법으로 변환
        while (decimal != 0) {
            stack.push(decimal % B);

            decimal /= B;
        }

        while (!stack.isEmpty()) {  // 스택이 빌때까지 출력
            System.out.print(stack.pop() + " ");
        }
    }
}