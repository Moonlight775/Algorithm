package backjoon;

import java.util.Scanner;

public class Number2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int H = in.nextInt(); // 시
        int M = in.nextInt(); // 분
        in.close();

        if(M < 45) {
            H--;		// 시(hour) 1 감소
            M= 60 - (45 - M); 	// 분(min) 감소
            if(H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        }
        else {
            System.out.println(H + " " + (M - 45));
        }
    }
}

//        Scanner sc = new Scanner(System.in);
//
//        int H = sc.nextInt();
//        int M = sc.nextInt();
//
//        if (M<=45) H = H-1;
//        if (H<=0 && M<=45) H = 23;
//
//        M = M-45 < 0 ? (M-45)+60 : M-45;
//
//        System.out.println(H + " " + M);
