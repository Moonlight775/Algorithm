package simpleQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DiffTime {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String now = br.readLine();
        String start = br.readLine();

        Date nowTime = new SimpleDateFormat("HH:mm:ss").parse(now);
        Date startTime = new SimpleDateFormat("HH:mm:ss").parse(start);

        long diffHor = (startTime.getTime() - nowTime.getTime()) / 3600000;
        long diffMin = (startTime.getTime() - nowTime.getTime()) / 60000;
        long diffSec = (startTime.getTime() - nowTime.getTime()) / 1000;

        System.out.println("시 : " + diffHor + "시간 차이");
        System.out.println("분 : " + diffMin + "분 차이");
        System.out.println("초 : " + diffSec + "초 차이");
    }
}
