package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());    // 집합 S의 크기
        int[] arr = new int[L]; // 집합 S 배열

        // 집합 S 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<L; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);   // 집합 S 오름차순정렬

        int n = Integer.parseInt(br.readLine());    // 집합에 포함된 정수

        int index = 0;  // n을 포함한 구간을 찾기 위한 인덱스 번호

        // 인덱스 번호 찾기
        for (int i=0; i<L; i++) {
            if (arr[i] >= n) {
                index = i;
                break;
            }
        }

        if (arr[index] == n) {
            System.out.println(0);
            return;
        }

        int A = arr[index-1]+1;
        int B = arr[index]-1;

        System.out.println((n-A+1)*(B-n+1)-1);
    }
}
