package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Student {
    String name;    // 이름
    int korean;     // 국어
    int english;    // 영어
    int math;       // 수학

    // 생성자
    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}

public class Number10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 학생의 수

        ArrayList<Student> list = new ArrayList<>();    //

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Student(
                    st.nextToken(), // 이름
                    Integer.parseInt(st.nextToken()),   // 국어
                    Integer.parseInt(st.nextToken()),   // 영어
                    Integer.parseInt(st.nextToken()))); // 수학
        }

        list.sort((o1, o2) -> {
            if (o1.korean == o2.korean) {   // 국어점수가 같다면
                if (o1.english == o2.english) { // 영어점수까지 같다면
                    if (o1.math == o2.math) {   // 모든 점수가 같다면
                        return o1.name.compareTo(o2.name);  // 이름 사전 순으로 오름차순 정렬
                    }
                    return o2.math - o1.math;   // 수학 점수 내림차순 정렬
                }
                return o1.english - o2.english; // 영어 점수 오름차순 정렬
            }
            return o2.korean - o1.korean;   // 국어 점수 내림차순 정렬
        });

        StringBuilder sb = new StringBuilder();
        for (Student i : list) {
            sb.append(i.name).append('\n');
        }

        System.out.println(sb);
    }
}