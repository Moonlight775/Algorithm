package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2684 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] seq = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};

        int P = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        while (P-- > 0) {
            int[] num = new int[8];
            String result = br.readLine();

            for (int i = 0; i < 38; i++) {
                String comp = result.substring(i, i + 3);   // 동전 3개의 수열
                for (int j = 0; j < 8; j++) {
                    if (seq[j].equals(comp)) {  // 8가지 중 맞는 수열의 인덱스를 +1
                        num[j]++;
                    }
                }
            }

            for (int ans : num) {
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}