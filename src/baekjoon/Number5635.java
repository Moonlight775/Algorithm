package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Number5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 학생의 수
        String[][] student = new String[n][4];

        // 학생 초기화
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 4; j++) {
                student[i][j] = st.nextToken();
            }
        }

        // 연, 월, 일 순으로 정렬
        Arrays.sort(student, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[3].equals(o2[3])) {
                    if (o1[2].equals(o2[2])) {
                        return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
                    }
                    else {
                        return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                    }
                }
                else {
                    return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
                }
            }
        });

        System.out.println(student[n-1][0]);
        System.out.println(student[0][0]);
    }
}
