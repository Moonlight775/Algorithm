package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] burger = new int[3];  // 햄버거 배열
        int[] drink = new int[2];   // 음료수 배열
        int min_burger = 0;     // 햄버거 최소 가격
        int min_drink = 0;      // 음료수 최소 가격

        for(int i=0; i<3; i++) {
            burger[i] = Integer.parseInt(br.readLine());

            if (i == 0) {   // 반복해서 초기화 되지 않도록 0번째 인덱스에서 초기화
                min_burger = burger[0];
            }

            if (min_burger > burger[i]) {   // 최소값 찾기
                min_burger = burger[i];
            }
        }

        for(int i=0; i<2; i++) {
            drink[i] = Integer.parseInt(br.readLine());

            if (i == 0) {
                min_drink = drink[0];
            }

            if (min_drink > drink[i]) {
                min_drink = drink[i];
            }
        }

        System.out.println((min_burger + min_drink)-50);    // 세트 가격에 -50원이 빠지므로 -50을 해줌
    }
}
