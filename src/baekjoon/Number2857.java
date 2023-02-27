package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for (int i=1; i<=5; i++) {
            String str = br.readLine(); // 첩보원명

            if (str.contains("FBI")) {
                sb.append(i).append(" ");
                flag = false;
            }
        }

        if (flag) {
            System.out.println("HE GOT AWAY!");
        } else {
            System.out.println(sb);
        }

    }
}
