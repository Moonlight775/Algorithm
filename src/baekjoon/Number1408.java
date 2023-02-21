package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Number1408 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String current = br.readLine(); // 지금 시간
        String start = br.readLine();   // 임무 시작 시간

        // Date 형 변환
        Date current_time = new SimpleDateFormat("HH:mm:ss").parse(current);
        Date start_time = new SimpleDateFormat("HH:mm:ss").parse(start);

        // 남은 시간 (초)
        long diffSec = (start_time.getTime() - current_time.getTime()) / 1000;

        long hour, minute, second;

        hour = Math.abs(diffSec / 3600);
        minute = Math.abs(diffSec % 3600 / 60);
        second = Math.abs(diffSec % 3600 % 60);

        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
}
