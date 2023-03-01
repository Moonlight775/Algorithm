package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;

public class Number2526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int rest = N;   // 다음 값을 구하기 위한 나머지
        int count = 0;  // 서로 다른 수의 개수

        ArrayList<Integer> list = new ArrayList<>();    // 서로 다른 수를 담을 리스트
        list.add(N);

        while (true) {
            int num = (rest * N) % P;

            list.add(num);

            for (int i=0; i<list.size()-1; i++) {
                for (int j=i+1; j<list.size(); j++) {
                    if (Objects.equals(list.get(i), list.get(j))) {   // 같은 수가 나오면 종료
                        System.out.println(count);
                        return;
                    }
                }
            }

            count++;
            rest = num;
        }
    }
}
