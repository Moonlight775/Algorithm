package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<Integer>();

        int K = Integer.parseInt(br.readLine());

        for(int i=0; i<K; i++) {
            int number = Integer.parseInt(br.readLine());

            if(number == 0) {
                stack.pop();
            } else {
                stack.push(number);
//                stack.add(number); add()도 가능
            }
        }
        int sum =0;

        for(int o : stack) {
            sum += o;
        }

        System.out.println(sum);

        /*int top = 0;

        int K = Integer.parseInt(br.readLine());
        int[] stk = new int[K];

        for (int i=0; i<K; i++) {
            int number = Integer.parseInt(br.readLine());
            if (top < 0) {
                return;
            }
            if (number == 0) {
                top--;
            }else {
                stk[top] = number;
                top++;
            }
        }
        int sum =0;
        for (int i=0; i<top; i++) {
            sum += stk[i];
        }
        System.out.println(sum);*/
    }
}
