package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        str = str.replaceAll("XXXX", "AAAA");
        str = str.replaceAll("XX", "BB");

        // X가 포함된다면 덮을 수 없다는 의미로 -1 출력
        if (str.contains("X")) {
            System.out.println(-1);
        }
        else {
            System.out.println(str);
        }
    }
}
