package baekjoon;

import java.util.Scanner;

public class Number10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int A = 0;
        int B = 0;
        int C = 0;

        if (T/300 > 0) {    // T가 300초보다 커서 값이 존재한다면
            A = T/300;      // A에 300초로 나눈 몫으로 초기화해준다.
            T = T%300;      // 나머지 T는 300으로 나눈후의 나머지가 된다.
        }

        if (T/60 > 0) {     // A와 동일하게 B인 60초에 맞게 적용
            B = T/60;
            T = T%60;
        }

        if (T/10 > 0) {     // A와 동일하게 C인 10초에 맞게 적용
            C = T/10;
        }

        if (T%10 > 0) {     // 10초로 더 이상 나누지 못하고 나머지가 남는다면 T초를 맞출 수 없다는 의미
            System.out.println(-1);
        } else {
            System.out.print(A + " " + B + " " + C);
        }

    }
}
