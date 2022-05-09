package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i=1; i<=100; i++) {        // 10000이하의 자연수가 주어지므로 100^2이 최대이다.
            if (M <= i*i && i*i <= N ) {    // M과 N사이에 완전제곱수가 있을 경우
                list.add(i * i);            // list에 완전제곱수 값 추가
            }
        }

        if (list.size() == 0) {             // list가 비어있을 경우는 완전제곱수가 없다는 뜻
            System.out.println(-1);         // -1을 출력한다.
        }
        else {                              // list에 값이 있을 경우 (완전제곱수가 있을 경우)
            for (int i : list) {            
                sum += i;                   // list에 담겨 있는 값을 모두 더한다.
            }
                System.out.println(sum);
                System.out.println(list.get(0));    // list에 담긴 값 중 최솟값 출력
        }
    }
}
