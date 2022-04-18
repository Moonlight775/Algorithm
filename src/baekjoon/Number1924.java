package baekjoon;

import java.util.Calendar;
import java.util.Scanner;

public class Number1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        String[] dates = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"}; // 요일

        int x = sc.nextInt();   // 입력받은 월
        int y = sc.nextInt();   // 입력받은 일

        calendar.set(2007,x-1, y);  // 월은 0부터 시작

        int day = calendar.get(Calendar.DAY_OF_WEEK);   // 해당 날짜의 요일 -> 1~7 숫자로 변환 (일요일 시작)

        System.out.println(dates[day-1]);   // 배열의 index는 0부터 시작하므로 day-1을 해줌

        sc.close();
    }
}
