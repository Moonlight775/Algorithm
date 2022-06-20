package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 소수를 구하는데도 int형인 이유는 직접 소수를 구하는 것이 아닌 나머지를 이용하기 때문이다.
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int remainder = A % B;  // 첫 번째 나머지

        for (int i=0; i<N-1; i++) {     // 첫 번째 나머지는 미리 구해줬기 때문에 조건 범위는 N-1해준다.
            remainder = remainder * 10 % B;     // 두 번째 나머지를 구하기 위해서는 (그 전 나머지*10)%B와 같다. 직접 써보며 나누기를 해보면 알아보기 쉽다.
        }
        System.out.println((remainder*10)/B);   // 소수값은 (나머지*10)/B를 한 값으로 나온다.
    }
}
