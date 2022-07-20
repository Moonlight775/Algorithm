package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Number1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());    // 학생 수

        int[][] student = new int[N][5];
        int[] count = new int[N];

        int max = 0;
        int result = 0;

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<5; j++) {
                student[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<N; i++) {
            Set<Integer> sameClass = new HashSet<>();

            for (int j=0; j<5; j++) {
                for (int k=0; k<N; k++) {
                    if (student[i][j] == student[k][j] && k !=i) {
                        sameClass.add(k);
                    }
                }
            }

            if (max < sameClass.size()) {
                max = sameClass.size();
                result = i;
            }

        }

        System.out.println(result+1);
    }
}
