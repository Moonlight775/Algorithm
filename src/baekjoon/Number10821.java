package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number10821 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");

        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        System.out.println(list.size());
    }
}