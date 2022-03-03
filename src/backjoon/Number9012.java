package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());



        for (int i=0; i<T; i++) {
            String str = br.readLine();
            int lef = 0;
            int rig = 0;

            for (int j=0; j<str.length(); j++) {
                if (str.charAt(j) == '(') {
                    lef++;
                } else {
                    rig++;
                }
            }

            if (lef != rig) {
                sb.append("NO").append('\n');
            } else {
                sb.append("YES").append('\n');
            }
        }
        System.out.println(sb);
    }

}
