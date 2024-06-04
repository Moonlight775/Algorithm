package baekjoon;

import java.time.LocalDate;
import java.time.ZoneId;

public class Number10699 {
    public static void main(String[] args) {
        LocalDate seoulNow = LocalDate.now(ZoneId.of("Asia/Seoul"));

        System.out.println(seoulNow);
    }
}