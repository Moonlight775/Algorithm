package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());   // A번째
        int B = Integer.parseInt(st.nextToken());   // B번째

        int[] arr = new int[B];     // B번째까지 담기 위한 배열
        int num = 0;    // 인덱스 번호
        int sum = 0;    // 총합

        for (int i=1; i<=B; i++) {
            for (int j=0; j<i; j++) {   // i번 반복하도록 조건설정
                if (num == B) break;    // 인덱스가 구하려는 B번째가 되면 for문 종료
                arr[num] = i;           // 인덱스에 차례대로 초기화
                num++;
            }
        }

        for (int i=A-1; i<B; i++) {     // 인덱스는 0부터 시작하므로 A번째부터 구하기 위해 A-1해준다.
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
