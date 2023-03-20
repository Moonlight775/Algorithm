package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Double> score = new ArrayList<>();    // 학점
        ArrayList<Double> grade = new ArrayList<>();    // 등급

        double sum = 0;     // 전공과목별 합
        double total = 0;   // 학점 총합

        for (int i=0; i<20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            st.nextToken(); // 과목명 사용 안 하므로 변수에 저장X
            double temp_score = (Double.parseDouble(st.nextToken()));   // P가 아닐 경우만 리스트에 저장하기 위한 임시 변수
            String temp_grade = st.nextToken(); // P일 경우를 찾기 위해 임시 변수에 저장
            switch (temp_grade) {
                case "A+" : grade.add(4.5);
                    break;
                case "A0" : grade.add(4.0);
                    break;
                case "B+" : grade.add(3.5);
                    break;
                case "B0" : grade.add(3.0);
                    break;
                case "C+" : grade.add(2.5);
                    break;
                case "C0" : grade.add(2.0);
                    break;
                case "D+" : grade.add(1.5);
                    break;
                case "D0" : grade.add(1.0);
                    break;
                case "F"  : grade.add(0.0);
                    break;
            }

            if (!temp_grade.equals("P")) {  // 등급이 P면 학점 리스트에 저장 X
                score.add(temp_score);
            }
        }

        for (int i = 0; i < grade.size(); i++) {
            sum += score.get(i) * grade.get(i);
            total += score.get(i);
        }

        System.out.printf("%.6f", sum/total);
    }
}
