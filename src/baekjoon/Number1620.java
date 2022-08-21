package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Number1620 {

    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 포켓몬의 개수
        int M = Integer.parseInt(st.nextToken());   // 문제의 개수

        for (int i=1; i<=N; i++) {
            map.put(br.readLine(), i);  // 입력받은 문자열을 key로 하고, value는 1부터 1씩 증가하는 map
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<M; i++) {
            String str = br.readLine();     // 문제로 받는 문자열
            if (isNumber(str)) {    // 숫자를 입력받았다면
                int num = Integer.parseInt(str);
                sb.append(name(num)).append('\n');
            }
            else {  // 문자를 입력받았다면
                sb.append(map.get(str)).append('\n');
            }
        }

        System.out.println(sb);

    }

    // 숫자인지 문자열인지 판단
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    // 숫자가 입력되었을 때 value에 맞는 key를 찾기 위한 메소드 (1:1 매칭이기 때문에 가능)
    public static String name(int number) {
        String findKey = "";

        for (String key : map.keySet()) {
            if (map.get(key).equals(number)) {
                findKey = key;
                break;
            }
        }

        return findKey;
    }
}
