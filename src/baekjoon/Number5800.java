package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Number5800 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());    // 반의 수
        int classNum = 1;   // 반 번호

        while (K-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());   // 학생 수

            Integer[] arr = new Integer[N];     // 각 반의 성적 배열

            // 성적 배열 초기화
            for (int i=0; i<N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            // 반 번호 출력
            sb.append("Class ").append(classNum).append('\n');

            max(arr);
            min(arr);
            gap(arr);

            classNum++;     // 다음 반 번호 출력을 위해 증가
        }

        System.out.println(sb);
    }

    // 최대 점수 메소드
    public static void max(Integer[] arr) {
        int max = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        sb.append("Max ").append(max).append(", ");
    }

    // 최소 점수 메소드
    public static void min(Integer[] arr) {
        int min = 100;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        sb.append("Min ").append(min).append(", ");
    }

    // 점수 차이 메소드
    public static void gap(Integer[] arr) {
        int gapNum = 0;

        // 내림차순 정렬 (Comparator.reverseOrder() 사용하기 위해 Integer[] 사용)
        Arrays.sort(arr, Comparator.reverseOrder());

        // 가장 큰 인접한 점수 차이를 찾아야 하므로 i번째 index와 i-1번째 index 비교
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] - arr[i+1] > gapNum) {
                gapNum = arr[i] - arr[i+1];
            }
        }

        sb.append("Largest gap ").append(gapNum).append('\n');
    }

}
