package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Number10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 학생의 수
        String[][] arr = new String[N][4];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = st.nextToken();
            }
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[1].equals(o2[1])) {   // 국어 점수가 같으면
                    if (o1[2].equals(o2[2])) {   // 영어 점수까지 같으면
                        if (o1[3].equals(o2[3])) {   // 수학 점수까지 같다면
                            return o1[0].compareTo(o2[0]);  // 모든 점수가 같으면 이름 사전 순
                        }
                        return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);   // 국어, 영어 점수가 같으면 수학 점수 내림차순 정렬
                    }
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);   // 국어 점수가 같으면 영어 점수 오름차순 정렬
                }
                return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);   // 국어 점수 기준으로 내림차순 정렬
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String[] i : arr) {
            sb.append(i[0]).append('\n');
        }

        System.out.println(sb);
    }
}