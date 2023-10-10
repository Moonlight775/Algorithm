package chap10;

import java.util.Scanner;

public class BinTreeTester {
    static Scanner stdIn = new Scanner(System.in);

    // 데이터 (회원번호 + 이름)
    static class Data {
        public static final int NO = 1;     // 번호를 입력 받습니까?
        public static final int NAME = 2;   // 이름을 입력 받습니까?

        private Integer no;     // 회원번호 (키 값)
        private String name;    // 이름

        // 키 값
        Integer KeyCode() {
            return no;
        }

        // 문자열을 반환합니다.
        public String toString() {
            return name;
        }

        // 데이터를 입력합니다.
        void scanData(String guide, int sw) {
            System.out.println(guide + "할 데이터를 입력하ㅣ세요.");

            if ((sw & NO) == NO) {
                System.out.print("번호 : ");
                no = stdIn.nextInt();
            }
            if ((sw & NAME) == NAME) {
                System.out.print("이름 : ");
                name = stdIn.next();
            }
        }
    }

}
