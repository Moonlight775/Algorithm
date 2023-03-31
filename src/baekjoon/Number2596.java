package baekjoon;

import java.util.Scanner;

public class Number2596 {

    public static String A = "000000";
    public static String B = "001111";
    public static String C = "010011";
    public static String D = "011100";
    public static String E = "100110";
    public static String F = "101001";
    public static String G = "110101";
    public static String H = "111010";
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       // 문자의 개수
        String str = sc.next();     // 숫자화된 문자
        int fixLength = 6;          // 한 글자는 여섯 숫자이므로 6개로 자르기 위해
        String[] arr = new String[N];   // 문자열 6개씩 잘라서 담을 배열
        int index = 0;  // 배열 인덱스

        for (int i = 0; i < str.length(); i += fixLength) {
            arr[index] = str.substring(i, i + fixLength);   // 6개씩 잘라서 배열 초기화
            if (!checkSame(arr[index])) {   // 6개로 자른 문자열을 매개변수
                System.out.println(index+1);
                return;
            }
            index++;
        }

        System.out.println(sb);
    }

    public static boolean checkSame(String str) {
        // 만약 문자가 같지 않거나 다른 문자가 2개 이상이라면 false
        if (str.equals(A) || checkDifferent(str, A)) {
            sb.append("A");
            return true;
        } else if (str.equals(B) || checkDifferent(str, B)) {
            sb.append("B");
            return true;
        } else if (str.equals(C) || checkDifferent(str, C)) {
            sb.append("C");
            return true;
        } else if (str.equals(D) || checkDifferent(str, D)) {
            sb.append("D");
            return true;
        } else if (str.equals(E) || checkDifferent(str, E)) {
            sb.append("E");
            return true;
        } else if (str.equals(F) || checkDifferent(str, F)) {
            sb.append("F");
            return true;
        } else if (str.equals(G) || checkDifferent(str, G)) {
            sb.append("G");
            return true;
        } else if (str.equals(H) || checkDifferent(str, H)) {
            sb.append("H");
            return true;
        }

        return false;
    }

    public static boolean checkDifferent(String str, String alphabet) {
        int count = 0;  // 다른 문자 개수

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != alphabet.charAt(i)) {
                count++;
            }
        }
        return count <= 1;    // 다른 문자 개수가 2개 이상이면 false
    }
}
