package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 도시의 개수

        long[] distance = new long[N-1];  // 도로 길이
        long[] price = new long[N];       // 도시 별 리터당 기름 가격

        // 도로 길이 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<distance.length; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        // 기름 가격 초기화
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<price.length; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        long result = 0;

        // 맨 마지막 도시에서는 기름을 넣을 필요가 없으므로 조건범위는 도로 길이 배열의 크기로 하면 된다.
        for (int i=0; i< distance.length; i++) {
            // i번째 기름 가격이 i+1번째 기름 가격보다 작다면
            // i번째 기름으로 i+2번째까지 가는 것이 저렴해짐
            if (price[i] < price[i+1]) {
                price[i+1] = price[i];
            }
            result += price[i] * distance[i];
        }

        System.out.println(result);
    }
}
