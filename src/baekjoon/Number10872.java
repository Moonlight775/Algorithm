package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = factorial(N);
        System.out.println(sum);

//      for문을 사용할 경우
//        int factorial = 1;
//
//        for(int i=N; i>0; i--) {
//            factorial *= i;
//        }
//        System.out.println(factorial);
    }

    public static int factorial(int N) {
        if(N <= 1) return 1;    // 재귀 종료조건
        return N * factorial(N-1);

//      ex) 6이 대입 되었을 때
//        6 * factorial(5){
//            5 * factorial(4){
//                4 * factorial(3){
//                    3 * factorial(2){
//                        2 * factorial(1){
//                            return 1;
//                        }
//                        return 2 * 1;
//                    }
//                    return 3 * 2 * 1;
//                }
//                return 4 * 3 * 2 * 1;
//            }
//            return 5 * 4 * 3 * 2 * 1;
//        }
//        return 6 * 5 * 4 * 3 * 2 * 1;
    }
}
