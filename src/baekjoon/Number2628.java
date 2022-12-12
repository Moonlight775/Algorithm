package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Number2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> width = new ArrayList<>();   // 가로
        ArrayList<Integer> height = new ArrayList<>();  // 세로

        width.add(0);   // 마지막 점선번호를 확인해주기 위해 0을 추가 (맨 밑 이중 for문)
        height.add(0);
        width.add(Integer.parseInt(st.nextToken()));
        height.add(Integer.parseInt(st.nextToken()));

        int N = Integer.parseInt(br.readLine());    // 잘라야하는 점선의 개수

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());

            int check = Integer.parseInt(st.nextToken());   // 가로, 세로 판단
            int num = Integer.parseInt(st.nextToken());     // 점선 번호

            if (check == 0) {       // 가로로 자르는 경우
                height.add(num);    // 세로 추가
            }
            else {                  // 세로로 자르는 경우
                width.add(num);     // 가로 추가
            }
        }

        // 정렬
        Collections.sort(width);
        Collections.sort(height);

        int max = 0;    // 넓이 최댓값을 담을 변수

        for (int i=width.size()-1; i>0; i--) {
            int w = width.get(i) - width.get(i-1);

            for (int j=height.size()-1; j>0; j--) {
                int h = height.get(j) - height.get(j-1);
                max = Math.max(max, w * h);
            }
        }

        System.out.println(max);
    }
}
