package baekjoon;

import java.util.Scanner;

public class Number1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        int length = N.length();

        if (Integer.parseInt(N) < 10) { // 1~9 사이의 수는 자릿수가 자신의 수와 같다.
            System.out.println(N);
            return;
        }

        // ex. N이 102라면 3자릿수에 해당하는 수의 개수는 102-99=3 이다. // 100, 101, 102
        // 102는 length가 3이고 즉, 3*3=9 만큼이 3자릿수에 해당하는 것이다.
        int front = (Integer.parseInt(N) - Integer.parseInt("9".repeat(length - 1))) * length;  // ex. (1200-999) * 4 = 201*4

        int num = 0;

        while (length-2 >= 0) {
            // ex. N=102 -> front 변수에 3자릿수의 개수는 구했고, 2자릿수 부터는 99-9=90 만큼이 2자릿수이므로 90*2=180이 된다.
            num += Integer.parseInt("9" + "0".repeat(length-2)) * (length-1);

            length = length - 1;
        }

        System.out.println(front + num);
    }
}
