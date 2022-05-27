package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Number1076 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();

        map.put("black", "0,1");
        map.put("brown", "1,10");
        map.put("red", "2,100");
        map.put("orange", "3,1000");
        map.put("yellow", "4,10000");
        map.put("green", "5,100000");
        map.put("blue", "6,1000000");
        map.put("violet", "7,10000000");
        map.put("grey", "8,100000000");
        map.put("white", "9,1000000000");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();

        String[] val1 = map.get(first).split(",");
        String[] val2 = map.get(second).split(",");
        String[] times = map.get(third).split(",");

        System.out.println(Long.parseLong(val1[0]+val2[0]) * Long.parseLong(times[1]));
    }
}
