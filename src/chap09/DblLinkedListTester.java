package chap09;

import java.util.Comparator;
import java.util.Scanner;

public class DblLinkedListTester {
    static Scanner stdIn = new Scanner(System.in);

    // 데이터 (회원번호 + 이름)
    static class Data {
        static final int NO   = 1;  // 번호를 입력 받습니까?
        static final int NAME = 2;  // 이름을 입력 받습니까?

        private Integer no;     // 회원번호
        private String name;    // 이름

        // 문자열을 반환합니다.
        public String toString() {
            return "(" + no + ") " + name;
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

        // 회원번호로 순서를 매기는 comparator
        public static final Comparator<Data> NO_ORDER = new NoOrderComparator();

        private static class NoOrderComparator implements Comparator<Data> {
            public int compare(Data d1, Data d2) {
                return (d1.no > d2.no) ? 1 : (d1.no < d2.no) ? -1 : 0;
            }
        }

        // 이름으로 순서를 매기는 comparator
        public static final Comparator<Data> NAME_ORDER = new NameOrderComparator();

        private static class NameOrderComparator implements Comparator<Data> {
            public int compare(Data d1, Data d2) {
                return d1.name.compareTo(d2.name);
            }
        }
    }

}
