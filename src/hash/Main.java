package hash;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static User user = new User();

    public static void main(String[] args) throws Exception{

        while (true) {
            System.out.println("1 : 회원가입 \t 2 : 로그인 \t 3 : 종료 ");
            System.out.print(">>>>>>>>  ");

            String n = in.nextLine();

            if (n.equals("1")) {
                make_user();
            }
            else if (n.equals("2")) {
                login();
            }
            else if (n.equals("3")) {
                System.out.println("시스템 종료");
                break;
            }
            else if (n.equals("st-lab")) {
                System.out.println("관리자 접근");
                user.get_DB();
            }
            else {
                System.out.println("잘못 입력");
            }
            System.out.println();
        }
    }

    // 아이디 생성
    static void make_user() throws Exception {
        System.out.print("아이디 입력\n>>>>>>>>   ");
        String id = in.nextLine();
        System.out.print("비밀번호 입력\n>>>>>>>>   ");
        String pass = in.nextLine();
        user.set_User(id, pass.getBytes());
    }

    // 로그인
    static void login() throws Exception {
        System.out.print("아이디 입력\n>>>>>>>>   ");
        String id = in.nextLine();
        System.out.print("비밀번호 입력\n>>>>>>>>   ");
        String pass = in.nextLine();

        user.get_User(id, pass.getBytes());
    }

}
