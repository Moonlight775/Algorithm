package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Number2635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        ArrayList<Integer> result = new ArrayList<>();  // 규칙에 따라 최대 개수가 가능한 리스트

        for (int i = num; i > num / 2; i--) {   // 임의의 정수/2 보다 값이 4번째부터는 음수이므로 조건 범위를 임의의 정수/2 보다 크게 설정
            ArrayList<Integer> list = new ArrayList<>();

            int n1 = num;   // 앞의 앞의 수
            int n2 = i;     // 앞의 수

            list.add(n1);
            list.add(n2);

            while (true) {
                int n3 = n1 - n2;   // 앞의 앞의 수 - 앞의 수
                if (n3 < 0) break;  // 음수가 되면 종료

                list.add(n3);
                n1 = n2;
                n2 = n3;
            }

            if (list.size() > result.size()) {  // 최대 개수만 result에 저장되도록
                result = list;
            }
        }

        System.out.println(result.size());
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
