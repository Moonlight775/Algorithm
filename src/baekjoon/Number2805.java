package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Number2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   // 나무의 수
        int M = Integer.parseInt(st.nextToken());   // 가져가려는 나무의 길이


        Integer[] arr = new Integer[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        Arrays.sort(arr, Comparator.reverseOrder());    // 내림차순 정렬

        int max = arr[0];   // 제일 높은 나무
        int i = 1;
        int sum = 0;
        int answer = 0;     // 1M씩 자른다는 가정하에 몇 번 잘라야하는지에 대한 횟수

        while (sum <= M) {

            if (arr[i - 1].equals(arr[i])) {   // 다음 나무와 크기가 같아지면
                i++;
            }

            sum += i;     // 나무 i개가 같은 높이가 되면 얻는 나무의 길이가 i개가 된다.
            arr[i-1]--;
            answer++;
        }

        System.out.println(max - (answer-1));   // 제일 높은 나무크기에서 반복된 횟수-1을 빼주면 절단기 높이를 알 수 있다.

    }
}
