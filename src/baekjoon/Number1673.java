package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();

            if (input == null) break;

            StringTokenizer st = new StringTokenizer(input);

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int count = n;
            int mok = n / k;
            count += mok;

            if (mok > 0) {
                mok /= k;
                count += mok;
            }

            System.out.println(count);
        }
    }
}
