package chqp11;

import java.util.Scanner;
// 오픈 주소법에 의한 해시의 사용 예

public class OpenHashTester {
    static Scanner stdIn = new Scanner(System.in);

    // 데이터(회원번호 + 이름)
    static class Data {
        static final int NO = 1;    // 번호를 입력 받습니까?
        static final int NAME = 2;  // 이름을 입력 받습니까?

        private Integer no;     // 회원번호(키 값)
        private String name;    // 이름

        // 키 값
        Integer keyCode() {
            return no;
        }

        // 문자열을 반환합니다.
        public String toString() {
            return name;
        }

        // 데이터를 입력합니다.
        void scanData(String guide, int sw) {
            System.out.println(guide + "할 데이터를 입력하세요.");

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

    // 메뉴 열거형
    enum Menu {
        ADD(      "추가"),
        REMOVE(   "삭제"),
        SEARCH(   "검색"),
        DUMP(     "출력"),
        TERMINATE("종료");

        private final String message;       // 출력할 문자열

        static Menu MenuAt(int idx) {       // 서수가 idx인 열거를 반환
            for (Menu m : Menu.values()) {
                if (m.ordinal() == idx) {
                    return m;
                }
            }
            return null;
        }

        Menu(String string) {   // 생성자
            message = string;
        }

        String getMessage() {   // 출력할 문자열을 반환
            return message;
        }
    }

    // 메뉴 선택
    static Menu SelectMenu() {
        int key;

        do {
            for (Menu m : Menu.values()) {
                System.out.printf("(%d) %s ", m.ordinal(), m.getMessage());
            }
            System.out.print(" : ");
            key = stdIn.nextInt();
        } while (Menu.ADD.ordinal() > key || key > Menu.TERMINATE.ordinal());

        return Menu.MenuAt(key);
    }

}