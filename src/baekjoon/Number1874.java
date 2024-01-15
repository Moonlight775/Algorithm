package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());    // 입력 받을 수의 개수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuffer sb = new StringBuffer();
        int num = 1;    // 오름차순 수
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            int now = arr[i];    // 현재 수열의 수

            // 현재 수열 값 >= 오름차순 자연수: 값이 같아질 때까지 push() 수행
            if (now >= num) {
                while (now >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            // 현재 수열 값 < 오름차순 자연수: pop()을 수행해 수열 원소를 꺼낸다
            else {
                int pop_num = stack.pop();

                // 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수 없다
                if (pop_num > now) {
                    System.out.println("NO");
                    flag = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }

        if (flag) {
            System.out.println(sb);
        }

/*        while (n-- > 0) {   // n번 반복
            int sequence = Integer.parseInt(br.readLine());     // 입력된 정수

            if (sequence > num) {   // 정수가 1일 경우도 push 해주어야 하므로 num = 0으로 초기화
                for (int i=num+1; i<=sequence; i++) {   // 1부터 입력된 정수까지
                    stack.push(i);                      // 스택에 push 해준다.
                    sb.append('+').append('\n');
                }
                num = sequence;     // 입력된 정수까지 스택에 쌓였으므로 그 다음 수부터 처리하기 위해 num 을 입력된 정수로 초기화
            }

            if (stack.peek() == sequence) {     // 스택의 맨 위 원소가 입력된 정수와 같다면
                stack.pop();                    // pop 해서 제거
                sb.append('-').append('\n');
            } else {                            // 스택의 맨 위 원소와 입력된 정수와 같지 않다는 것은 스택의 순서가 수열을 만들기 불가능하다는 것
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);
 */
    }
}
