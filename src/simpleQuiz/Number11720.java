package simpleQuiz;

import java.util.Scanner;

public class Number11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        if(cnt < 1 && cnt > 100) return;
        String str = sc.next();
        int sum = 0;

        for (int i=0; i<cnt; i++) {
//            sum += str.charAt(i)-'0';
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);

    }
}
