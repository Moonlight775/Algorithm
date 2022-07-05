package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();   // 방 번호
        N = N.replace('9', '6');    // 9를 뒤집어 6으로 이용 가능

        int[] set = new int[10];

        for (int i=0; i<N.length(); i++) {
            int num = N.charAt(i) - '0';    // 문자열을 문자로 변환 후 문자를 정수형으로 다시 변환
            set[num]++;                     // index가 겹치면 새로운 세트가 필요하다는 의미이므로 해당 index를 +1해준다.
        }

        // 9와 6은 혼용되므로, 필요한 세트 수는 index6을 2로 나눈 값과 같다. (홀수일 경우 1세트가 더 필요하여 +1 해준다)
        // ex. 999 -> 666 -> set[6] = 3; -> (3+1)/2 = 2;
        set[6] = (set[6]+1) / 2;

        // 배열의 가장 큰 값이 방 번호를 만들기 위한 세트의 개수의 최솟값과 같다.
        Arrays.sort(set);

        // 정렬 후 배열의 가장 큰 값을 출력
        System.out.println(set[9]);
    }
}
