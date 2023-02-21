package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.StringTokenizer;

public class Number1408 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 지금 시간 시, 분, 초
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int hours = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());
        int seconds = Integer.parseInt(st.nextToken());

        int current_time = (hours*3600) + (minutes*60) + seconds;   // 시간을 초로 변환

        // 임무 시작 시간 시, 분, 초
        st = new StringTokenizer(br.readLine(), ":");
        hours = Integer.parseInt(st.nextToken());
        minutes = Integer.parseInt(st.nextToken());
        seconds = Integer.parseInt(st.nextToken());

        int start_time = (hours*3600) + (minutes*60) + seconds; // 시간을 초로 변환

        int left_time;  // 남은 시간


        if (current_time < start_time)  {
            left_time = start_time - current_time;
        }
        // 현재 시간이 시작 시간보다 크다면 24시간을 빼준다. 23시에 임무 시작하고 현재 01시라면 아직 22시간 남은 것이기 대문
        else {
            left_time = (24 * 3600) - (current_time - start_time);
        }

        int left_hours = left_time / 3600;
        int left_minutes = left_time % 3600 / 60;
        int left_seconds = left_time % 3600 % 60;

        System.out.printf("%02d:%02d:%02d", left_hours, left_minutes, left_seconds);
    }
}
