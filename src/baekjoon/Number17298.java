package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Number17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 수열 A의 크기
        int[] A = new int[N];       // 수열 배열 생성
        int[] result = new int[N];  // 정답 배열 생성

        // 수열 A 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            // 스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
            while (!stack.isEmpty() && A[i] > A[stack.peek()]) {
                result[stack.pop()] = A[i];     // 정답 배열에 오큰수를 현재 수열로 저장
            }
            stack.push(i);  // 신규 데이터 push
        }

        // 스택이 비어 있지 않다면
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;   // 스택에 쌓인 index에 -1 저장
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb);
    }
}