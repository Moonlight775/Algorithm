package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Number1251 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> ts = new TreeSet<>();

        String str = br.readLine();

        String[] strs = new String[3];

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<str.length()-1; i++) {
            for (int j=i+1; j<str.length(); j++) {
                strs[0] = sb.append(str, 0, i).reverse().toString();
                sb.setLength(0);
                strs[1] = sb.append(str, i, j).reverse().toString();
                sb.setLength(0);
                strs[2] = sb.append(str.substring(j)).reverse().toString();
                sb.setLength(0);

                ts.add(strs[0] + strs[1] + strs[2]);
            }
        }

        System.out.println(ts.iterator().next());
    }
}
