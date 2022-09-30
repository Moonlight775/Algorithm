package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 끊어진 기타줄의 개수
        int M = Integer.parseInt(st.nextToken());   // 기타줄 브랜드 수

        int[] pack = new int[M];
        int[] unit = new int[M];

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            pack[i] = Integer.parseInt(st.nextToken());     // 패키지 가격 배열 초기화
            unit[i] = Integer.parseInt(st.nextToken());     // 낱개 가격 배열 초기화
        }

        Arrays.sort(pack);
        Arrays.sort(unit);

        int numOfPack = N / 6;  // 패키지로 살 수 있는 수
        int rest = N % 6;       // 패키지 구매 후 남는 수
        int result;
        // 패키지와 낱개를 같이 구매하는 경우의 변수
        int combiPrice = (numOfPack * pack[0]) + (rest * unit[0]);
        // 패키지로만 구매하는 경우의 변수
        int packPrice = (numOfPack+1) * pack[0];

        // 패키지로만 구매하는 경우와 낱개로만 구매하는 경우 중 최솟값
        result = Math.min(packPrice, N * unit[0]);
        // 위 결과 값과 패키지와 낱개를 섞어서 사는 경우 중 최솟값
        result = Math.min(result, combiPrice);

        System.out.println(result);
    }
}
