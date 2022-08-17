package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Number18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());    // 좌표의 개수
        int[] arr = new int[N];     // 입력된 좌표 배열
        int[] sorted = new int[N];  // 정렬된 좌표 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 배열 초기화
        for (int i=0; i<N; i++) {
            arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);    // 오름차순 정렬

        int rank = 0;   // 좌표 압축은 0부터 시작하므로

        for (int value : sorted) {
            if (!map.containsKey(value)) {  // key가 겹치는게 없을 경우
                map.put(value, rank);       // map key에 정렬된 좌표값을 넣고 value에 0부터 +1되는 값을 넣는다.
                rank++;
            }
        }

        for (int key : arr) {
            sb.append(map.get(key)).append(" ");    // 정렬 전 좌표값을 key로 하는 value를 출력
        }

        System.out.println(sb);
    }
}
